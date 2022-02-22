package com.itender.design.creative.factory.method;

/**
 * @Author: ITender
 * @Description: 奔驰工厂，生产奔驰车
 * @CreateTime: 2022-02-17 20:53
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
