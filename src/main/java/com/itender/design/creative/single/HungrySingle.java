package com.itender.design.creative.single;

/**
 * @Author: ITender
 * @CreateTime: 2022-02-17 20:09
 * @Description: 单例模式   饿汉式
 */
public class HungrySingle {
    private HungrySingle() {

    }

    private static HungrySingle instance = new HungrySingle();

    public static HungrySingle getInstance() {
        return instance;
    }
}
