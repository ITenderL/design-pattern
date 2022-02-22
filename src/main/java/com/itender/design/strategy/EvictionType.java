package com.itender.design.strategy;

/**
 * @Author: ITender
 * @CreateTime: 2022-02-19 21:47
 * @Description: 淘汰类型枚举
 */
public enum EvictionType {
    LAST("last","淘汰最后一名"),
    LRU("lru","淘汰最近最少使用"),
    LFU("lfu", "淘汰最不经常使用的");

    EvictionType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public EvictionType evictionType(String code) {
        if (LAST.code.equals(code)) {
            return LAST;
        }else if (LRU.code.equals(code)) {
            return LRU;
        }else if (LFU.code.equals(code)) {
            return LFU;
        }
        return null;
    }




}
