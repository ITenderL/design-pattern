package com.itender.design.structural.adapter.objadapter;

import org.springframework.stereotype.Service;

/**
 * @author yuanhewei
 * @date 2024/2/18 17:45
 * @description
 */
@Service
public class Adapter implements Target {

    /**
     * 关联被适配的类
     */
    private final Adaptee adaptee;

    /**
     * 构造器 可以通过构造函数传入具体需要适配的被适配类对象
     *
     * @param adaptee 被适配的类
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // 这里是使用委托的方式完成特殊功能
        adaptee.specificRequest();
    }
}
