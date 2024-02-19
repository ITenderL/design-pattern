package com.itender.design;

import com.itender.design.structural.adapter.objadapter.Adaptee;
import com.itender.design.structural.adapter.objadapter.Adapter;
import com.itender.design.structural.adapter.objadapter.ConcreteTarget;
import com.itender.design.structural.adapter.objadapter.Target;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yunehewei
 * @date 2022-02-17 20:11
 */
@SpringBootTest
class ObjectAdapterTest {

    @Test
    void testObjAdapter() {
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类，
        // 需要先创建一个被适配类的对象作为参数
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
