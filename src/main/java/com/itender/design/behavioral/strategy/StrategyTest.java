package com.itender.design.behavioral.strategy;

/**
 * @Author: ITender
 * @CreateTime: 2022-02-19 22:00
 * @Description: 策略模式测试类
 */
public class StrategyTest {
    public static void main(String[] args) {
        EvictionStrategy lastStrategy = StrategyFactory.getEvictionStrategy(EvictionType.LAST);
        lastStrategy.evictionCache();

        EvictionStrategy lruStrategy = StrategyFactory.getEvictionStrategy(EvictionType.LRU);
        lruStrategy.evictionCache();

        EvictionStrategy lfuStrategy = StrategyFactory.getEvictionStrategy(EvictionType.LFU);
        lfuStrategy.evictionCache();
    }
}
