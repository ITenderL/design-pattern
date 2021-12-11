package com.itender.jetcache.service.impl;

import com.itender.jetcache.entity.User;
import com.itender.jetcache.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yuan
 * @create 2021-10-20 10:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User loadUser(long userId) {
        System.out.println("load user: " + userId);
        User user = new User();
        user.setId(userId);
        user.setName("user" + userId);
        return user;
    }
}
