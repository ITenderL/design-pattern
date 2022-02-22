package com.itender.design.creative.factory.method;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 20:27
 */
public class Wuling implements Car {
    @Override
    public void createCar() {
        System.out.println("我是五菱宏光！");
    }
}
