package com.itender.design.strategy;


/**
 * @Author: ITender
 * @CreateTime: 2022-02-19 21:33
 * @Description: 淘汰最不经常使用的
 */
public class LfuEvictionStrategy implements EvictionStrategy {

    @Override
    public void evictionCache() {
        System.out.println("淘汰最不经常使用的！");
    }
}
