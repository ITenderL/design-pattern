package com.itender.design.strategy;

/**
 * @Author: ITender
 * @CreateTime: 2022-02-19 21:30
 * @Description: 淘汰策略
 */
public interface EvictionStrategy {
    /**
     * 淘汰方法
     */
    void evictionCache();
}
