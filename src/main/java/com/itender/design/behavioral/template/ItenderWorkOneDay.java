package com.itender.design.behavioral.template;

/**
 * @author itender
 * @date 2022/6/29 18:02
 * @desc itender一天的工作
 */
public class ItenderWorkOneDay extends WorkerOneDay {

    @Override
    public void getUp() {
        System.out.println("itender 起床了！");
    }

    @Override
    public void eatBreakfast() {
        System.out.println("itender 吃早饭了！");
    }

    @Override
    public void doWork() {
        System.out.println("itender 努力工作，加班写代码！");
    }

    @Override
    public void home() {
        System.out.println("itender 提交完代码下班回家！");
    }
}

