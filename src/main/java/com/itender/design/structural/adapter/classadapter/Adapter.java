package com.itender.design.structural.adapter.classadapter;

/**
 * @author yuanhewei
 * @date 2024/2/18 17:45
 * @description
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        // 调用父类的特殊处理方法
        super.specificRequest();
    }
}
