package com.itender.design.behavioral.strategy;


/**
 * @Author: ITender
 * @CreateTime: 2022-02-19 21:33
 * @Description: 淘汰最近最少使用的
 */
public class LruEvictionStrategy implements EvictionStrategy {

    @Override
    public void evictionCache() {
        System.out.println("淘汰最近最少使用的！");
    }
}
