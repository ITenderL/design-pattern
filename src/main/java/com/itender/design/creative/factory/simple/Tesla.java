package com.itender.design.creative.factory.simple;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 20:29
 */
public class Tesla implements Car {
    @Override
    public void createCar() {
        System.out.println("特斯拉！");
    }
}
