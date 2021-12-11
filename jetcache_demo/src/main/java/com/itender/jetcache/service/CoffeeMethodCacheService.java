package com.itender.jetcache.service;

import com.alicp.jetcache.anno.*;
import com.itender.jetcache.dao.CoffeeRepository;
import com.itender.jetcache.entity.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author yuan
 * @create 2021-10-26 10:42
 */
@Slf4j
@Service
public class CoffeeMethodCacheService {
    private static final String CACHE_NAME = "CoffeeMethodCache:";

    @Resource
    private CoffeeRepository coffeeRepository;

    @Transactional(rollbackFor = Exception.class)
    public Coffee add(Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    /**
     * 缓存在 Remote 的 Redis，也可以配置成 both 开启两级缓存
     */
    @Cached(name = CACHE_NAME, key = "#id", cacheType = CacheType.REMOTE, serialPolicy = SerialPolicy.KRYO,
            condition = "#id>0", postCondition = "result!=null")
    public Coffee get(int id) {
        return coffeeRepository.findById(id).orElse(null);
    }

    @Transactional(rollbackFor = Exception.class)
    @CacheUpdate(name = CACHE_NAME, key = "#coffee.id", value = "result", condition = "#coffee.id!=null")
    public Coffee update(Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    @Transactional(rollbackFor = Exception.class)
    @CacheInvalidate(name = CACHE_NAME, key = "#id")
    public void delete(int id) {
        coffeeRepository.deleteById(id);
    }
}
