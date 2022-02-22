package com.itender.design.behavioral.strategy2;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * @author itender
 * @date 2022/10/24 18:01
 * @desc
 */
@Service
public class UserTypeService {

    private final UserService userService;

    @Autowired
    public UserTypeService(UserService userService) {
        this.userService = userService;
    }

    public static final Map<String, Function<String, List<User>>> USER_TYPE_FACTORY = new HashMap<>(16);

    @PostConstruct
    public void init() {
        USER_TYPE_FACTORY.put("ordinary", userService::getOrdinaryUserList);
        USER_TYPE_FACTORY.put("vip", userService::getVipUserList);
        USER_TYPE_FACTORY.put("superVip", userService::getSuperVipUserList);
    }

    public List<User> getUserListByType(String type) {
        Function<String, List<User>> result = USER_TYPE_FACTORY.get(type);
        if (Objects.isNull(result)) {
            return Lists.newArrayList();
        }
        return result.apply(type);
    }
}

