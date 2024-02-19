package com.itender.design.structural.adapter.classadapter;

/**
 * @author yuanhewei
 * @date 2024/2/18 18:00
 * @description
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("类适配器-ConcreteTarget: 普通的实现类，具有普通的功能！");
    }
}
