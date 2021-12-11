package com.itender.jetcache.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CreateCache;
import com.itender.jetcache.service.MyService;
import com.itender.jetcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuan
 * @create 2021-10-20 10:48
 */
@Service
public class MyServiceImpl implements MyService {
    @CreateCache(name = "myServiceCache")
    private Cache<String, String> cache;

    @Autowired
    private UserService userService;

    @Override
    public void createCacheDemo() {
        cache.put("myKey", "myValue");
        String myValue = cache.get("myKey");
        System.out.println("get 'myKey' from cache:" + myValue);
    }

    @Override
    public void cachedDemo() {
        userService.loadUser(1);
        userService.loadUser(1);
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
