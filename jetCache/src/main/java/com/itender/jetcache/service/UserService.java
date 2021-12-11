package com.itender.jetcache.service;

import com.alicp.jetcache.anno.Cached;
import com.itender.jetcache.entity.User;

/**
 * @author yuan
 * @create 2021-10-20 10:09
 */
public interface UserService {
    @Cached(name = "loadUser", expire = 10)
    User loadUser(long userId);
}
