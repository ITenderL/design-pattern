package com.itender.design.creative.factory.simple;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 20:27
 */
public class Wuling implements Car {
    @Override
    public void createCar() {
        System.out.println("五菱宏光！");
    }
}
