package com.itender.design.creative.single;

/**
 * @Author: ITender
 * @Description: 单例模式  双重检索式(线程安全)
 * @CreateTime: 2022-02-17 20:19
 */
public class DclSingle {
    private DclSingle() {

    }

    private static DclSingle instance;

    public static DclSingle getInstance() {
        if (instance == null) {
            synchronized (DclSingle.class) {
                if (instance == null) {
                    instance = new DclSingle();
                }
            }
        }
        return instance;
    }
}
