package com.itender.design.creative.factory.method;

/**
 * @Author: ITender
 * @Description: 特斯拉工厂，生产特斯拉车
 * @CreateTime: 2022-02-17 20:52
 */
public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
