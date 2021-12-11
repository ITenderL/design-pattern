package com.itender.jetcache.service;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.itender.jetcache.dao.CoffeeRepository;
import com.itender.jetcache.entity.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author yuan
 * @create 2021-10-26 10:37
 */
@Slf4j
@Service
public class CoffeeCreateCacheService {
    private static final String CACHE_NAME = "CoffeeCreateCache:";

    @Resource
    private CoffeeRepository coffeeRepository;

    /**
     * 使用 @CreateCache 注解创建Cache实例;
     * 未定义默认值的参数，将使用yml中指定的全局配置;
     * 缓存在 Local，也可以配置成 both 开启两级缓存
     */
    @CreateCache(name = CACHE_NAME, expire = 1, localLimit = 10,
            timeUnit = TimeUnit.MINUTES, cacheType = CacheType.LOCAL)
    private Cache<Integer, Coffee> coffeeCache;

    public CoffeeCreateCacheService() {
    }

    @Transactional(rollbackFor = Exception.class)
    public void add(Coffee coffee) {
        coffeeRepository.save(coffee);
        coffeeCache.put(coffee.getId(), coffee, 3, TimeUnit.SECONDS);
    }

    public Optional<Coffee> get(int id) {
        Coffee coffee = coffeeCache.get(id);
        log.info("CoffeeCreateCache get {} res {}", id, coffee);
        if (Objects.isNull(coffee)) {
            Optional<Coffee> coffeeOptional = coffeeRepository.findById(id);
            if (coffeeOptional.isPresent()) {
                coffee = coffeeOptional.get();
                boolean res = coffeeCache.putIfAbsent(id, coffee);
                log.info("CoffeeCreateCache putIfAbsent {} res {}", id, res);
            }
        }
        return Optional.ofNullable(coffee);
    }

    @Transactional(rollbackFor = Exception.class)
    public Coffee update(Coffee coffee) {
        Coffee c = coffeeRepository.save(coffee);
        coffeeCache.put(c.getId(), c, 60, TimeUnit.SECONDS);
        return c;
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(int id) {
        coffeeRepository.deleteById(id);
        boolean res = coffeeCache.remove(id);
        log.info("CoffeeCreateCache delete {} res {}", id, res);
    }

}
