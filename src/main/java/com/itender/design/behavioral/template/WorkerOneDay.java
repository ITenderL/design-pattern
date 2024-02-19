package com.itender.design.behavioral.template;

/**
 * @author itender
 * @date 2022/6/27 16:34
 * @desc 工作一天的抽象类
 */
public abstract class WorkerOneDay {

    public final void myOneDay() {

        // 起床
        getUp();

        // 吃早饭
        eatBreakfast();

        // 工作
        doWork();

        // 下班回家
        home();
    }

    /**
     * 起床
     */
    public abstract void getUp();

    /**
     * 吃早饭
     */
    public abstract void eatBreakfast();

    /**
     * 写代码
     */
    public abstract void doWork();

    /**
     * 下班回家
     */
    public abstract void home();
}
