package com.itender.design.creative.factory.method;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 20:29
 */
public class Tesla implements Car {
    @Override
    public void createCar() {
        System.out.println("我是特斯拉！");
    }
}
