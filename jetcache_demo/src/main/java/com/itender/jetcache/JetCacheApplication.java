package com.itender.jetcache;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import com.itender.jetcache.entity.Coffee;
import com.itender.jetcache.service.CoffeeCreateCacheService;
import com.itender.jetcache.service.CoffeeMethodCacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author yuan
 * @create 2021-10-26 10:33
 */
@Slf4j
@EnableMethodCache(basePackages = "cn.mariojd.jetcache")
@EnableCreateCacheAnnotation
@SpringBootApplication
public class JetCacheApplication implements ApplicationRunner {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(JetCacheApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Resource
    private CoffeeCreateCacheService coffeeCreateCacheService;

    @Resource
    private CoffeeMethodCacheService coffeeMethodCacheService;

    @Override
    public void run(ApplicationArguments args) throws InterruptedException {
        // Test Coffee create cache
        Coffee latte = Coffee.builder().name("Latte").price(20.0f).build();
        coffeeCreateCacheService.add(latte);
        log.info("Reading from cache... {}", coffeeCreateCacheService.get(latte.getId()));
        TimeUnit.SECONDS.sleep(3);
        log.info("Cache expire... ");
        coffeeCreateCacheService.get(latte.getId());
        latte.setPrice(25.0f);
        latte = coffeeCreateCacheService.update(latte);
        coffeeCreateCacheService.delete(latte.getId());

        // Test Coffee method cache
        Coffee cappuccino = Coffee.builder().name("Cappuccino").price(30.0f).build();
        coffeeMethodCacheService.add(cappuccino);
        coffeeMethodCacheService.get(cappuccino.getId());
        log.info("Reading from cache... {}", coffeeMethodCacheService.get(cappuccino.getId()));
        cappuccino.setPrice(25.0f);
        cappuccino = coffeeMethodCacheService.update(cappuccino);
        coffeeMethodCacheService.delete(cappuccino.getId());
    }
}
