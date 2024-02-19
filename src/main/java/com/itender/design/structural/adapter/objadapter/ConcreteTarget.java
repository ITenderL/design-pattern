package com.itender.design.structural.adapter.objadapter;

/**
 * @author yuanhewei
 * @date 2024/2/18 18:00
 * @description
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("对象适配器-ConcreteTarget: 普通的实现类，具有普通的功能！");
    }
}
