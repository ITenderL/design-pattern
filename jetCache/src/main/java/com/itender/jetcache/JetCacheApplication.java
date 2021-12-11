package com.itender.jetcache;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import com.itender.jetcache.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author yuan
 * @create 2021-10-20 10:02
 */
@SpringBootApplication
@EnableMethodCache(basePackages = "com.itender.jetcache")
@EnableCreateCacheAnnotation
public class JetCacheApplication {
    public static void main(String[] args) {
        // SpringApplication.run(JetCacheApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(JetCacheApplication.class);
        MyService myService = context.getBean(MyService.class);
        myService.createCacheDemo();
        myService.cachedDemo();
    }
}
