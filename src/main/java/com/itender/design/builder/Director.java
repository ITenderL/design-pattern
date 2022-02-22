package com.itender.design.builder;

/**
 * @Author: ITender
 * @Description: 核心：建造指挥者，指挥构建一个工程，工程如何构建由他决定
 * @CreateTime: 2022-02-18 00:00
 */
public class Director {
    /**
     * 指挥者指挥工人按照顺序建房子
     *
     * @param builder
     * @return
     */
    public Product builder(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        // 返回产品
        return builder.getProduct();
    }
}
