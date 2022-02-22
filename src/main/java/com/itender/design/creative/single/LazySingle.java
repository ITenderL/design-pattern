package com.itender.design.creative.single;

/**
 * @Author: ITender
 * @Description: 单例模式 懒汉式
 * @CreateTime: 2022-02-17 20:17
 */
public class LazySingle {

    private LazySingle() {

    }

    private static LazySingle instance;

    public static LazySingle getInstance() {
        if (instance == null) {
            instance = new LazySingle();
        }
        return instance;
    }
}
