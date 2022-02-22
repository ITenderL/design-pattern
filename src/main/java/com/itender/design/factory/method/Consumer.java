package com.itender.design.factory.method;

/**
 * @Author: ITender
 * @Description: 工厂方法模式测试类
 * @CreateTime: 2022-02-17 20:30
 */
public class Consumer {
    public static void main(String[] args) {
        Car tesla = new TeslaFactory().getCar();
        Car wuling = new WulingFactory().getCar();
        Car benz = new BenzFactory().getCar();
        wuling.createCar();
        tesla.createCar();
        benz.createCar();
    }
}
