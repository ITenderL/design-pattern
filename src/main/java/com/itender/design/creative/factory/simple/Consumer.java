package com.itender.design.creative.factory.simple;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 20:30
 */
public class Consumer {
    public static void main(String[] args) {
        Car wuling = (Car) CarFactory.getCar("wuling");
        Car tesla = (Car) CarFactory.getCar("tesla");
        Car benz = (Car) CarFactory.getCar("benz");
        wuling.createCar();
        tesla.createCar();
        benz.createCar();

    }
}
