package com.itender.design.creative.factory.method;

/**
 * @Author: ITender
 * @Description: 五菱工厂，生产五菱车
 * @CreateTime: 2022-02-17 20:53
 */
public class WulingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
