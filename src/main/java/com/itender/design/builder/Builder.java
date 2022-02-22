package com.itender.design.builder;

/**
 * @Author: ITender
 * @Description: 建造者模式:抽象的构建者方法
 * @CreateTime: 2022-02-17 23:43
 */
public abstract class Builder {
    /**
     * 打地基
     */
    abstract void buildA();
    /**
     * 钢筋水泥工程
     */
    abstract void buildB();
    /**
     * 电线
     */
    abstract void buildC();
    /**
     * 粉刷墙皮
     */
    abstract void buildD();

    /**
     * 完工，建成房子
     * @return
     */
    abstract Product getProduct();
}
