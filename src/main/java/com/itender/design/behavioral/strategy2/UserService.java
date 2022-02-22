package com.itender.design.behavioral.strategy2;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author itender
 * @date 2022/10/24 18:07
 * @desc
 */
@Component
public class UserService {

    public List<User> getOrdinaryUserList(String type) {
        List<User> list = Lists.newArrayList();
        list.add(new User(1, "张三", "山东", 18, type));
        list.add(new User(2, "李四", "河北", 20, type));
        return list;
    }

    public List<User> getVipUserList(String type) {
        List<User> list = Lists.newArrayList();
        list.add(new User(3, "王五", "湖南", 31, type));
        list.add(new User(4, "赵六", "湖北", 28, type));
        return list;
    }

    public List<User> getSuperVipUserList(String type) {
        List<User> list = Lists.newArrayList();
        list.add(new User(5, "阿七", "广东", 33, type));
        list.add(new User(6, "大飞", "深圳", 43, type));
        return list;
    }
}

