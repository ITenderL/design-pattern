package com.itender.design.structural.adapter.classadapter;

/**
 * @author yuanhewei
 * @date 2024/2/18 17:45
 * @description
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("类适配器-Adaptee: 需要被适配器包装的具有特殊功能的类！");
    }
}
