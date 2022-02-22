package com.itender.design;

import com.itender.design.behavioral.strategy2.User;
import com.itender.design.behavioral.strategy2.UserService;
import com.itender.design.behavioral.strategy2.UserTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author  ITender
 * @date 2022-02-17 20:11
 */
@SpringBootTest
class DesignPatternTest {

    @Test
    void strategyPlusTest() {
        UserTypeService typeService = new UserTypeService(new UserService());
        List<User> ordinaryUserList = typeService.getUserListByType("ordinary");
        System.out.println(ordinaryUserList);
        List<User> vipUserList = typeService.getUserListByType("vip");
        System.out.println(vipUserList);
        List<User> superVipUserList = typeService.getUserListByType("superVip");
        System.out.println(superVipUserList);
    }
}
