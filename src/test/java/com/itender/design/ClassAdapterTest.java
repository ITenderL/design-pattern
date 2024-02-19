package com.itender.design;


import com.itender.design.structural.adapter.classadapter.Adapter;
import com.itender.design.structural.adapter.classadapter.ConcreteTarget;
import com.itender.design.structural.adapter.classadapter.Target;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yuanhewei
 * @date 2022-02-17 20:11
 */
@SpringBootTest
class ClassAdapterTest {

    @Test
    void testClassAdapter() {
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.request();
    }
}
