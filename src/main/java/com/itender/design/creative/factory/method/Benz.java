package com.itender.design.creative.factory.method;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 20:34
 */
public class Benz implements Car {
    @Override
    public void createCar() {
        System.out.println("我是奔驰！");
    }
}
