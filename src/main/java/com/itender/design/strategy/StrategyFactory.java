package com.itender.design.strategy;

import java.util.HashMap;
import java.util.Map;

import static com.itender.design.strategy.EvictionType.*;

/**
 * @Author: ITender
 * @CreateTime: 2022-02-19 21:46
 * @Description: 策略工厂
 */
public class StrategyFactory {
    public static Map<EvictionType, EvictionStrategy> evictionMap = new HashMap<>();

    static {
        evictionMap.put(LAST, new LastEvictionStrategy());
        evictionMap.put(LRU, new LruEvictionStrategy());
        evictionMap.put(LFU, new LfuEvictionStrategy());
    }

    public static EvictionStrategy getEvictionStrategy(EvictionType evictionType) {
        return evictionMap.get(evictionType);
    }
}
