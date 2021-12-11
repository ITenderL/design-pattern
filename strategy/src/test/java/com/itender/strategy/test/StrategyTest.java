package com.itender.strategy.test;

import com.itender.strategy.StrategyApplication;
import com.itender.strategy.entity.Context;
import com.itender.strategy.service.impl.Add;
import com.itender.strategy.service.impl.Multiply;
import com.itender.strategy.service.impl.Subtract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @author yuan
 * @create 2021-09-29 11:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StrategyApplication.class)
public class StrategyTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void strategyTest1() {
        Context context = new Context(new Add());
        System.out.println(context.executeStrategy(20, 5));

        context = new Context(new Subtract());
        System.out.println(context.executeStrategy(20, 5));

        context = new Context(new Multiply());
        System.out.println(context.executeStrategy(20, 5));
    }

    @Test
    public void redisTest() {
        redisTemplate.opsForValue().set("a", "123", 30, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("b", "456", 30, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("c", "789", 30, TimeUnit.SECONDS);
        System.out.println(redisTemplate.opsForValue().get("a").toString());
    }

}
