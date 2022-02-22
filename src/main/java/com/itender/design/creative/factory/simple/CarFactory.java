package com.itender.design.creative.factory.simple;

import com.itender.design.creative.factory.method.Benz;
import com.itender.design.creative.factory.method.Car;
import com.itender.design.creative.factory.method.Tesla;
import com.itender.design.creative.factory.method.Wuling;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 20:32
 */
public class CarFactory {

    public static Car getCar(String name) {
        if ("wuling".equals(name)) {
            return new Wuling();
        } else if ("tesla".equals(name)) {
            return new Tesla();
        } else if ("benz".equals(name)) {
            return new Benz();
        }
        return null;
    }
}
