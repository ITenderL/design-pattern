package com.itender.design.behavioral.template;

/**
 * @author itender
 * @date 2022/6/29 18:06
 * @desc 测试工作一天
 */
public class TesterWorkOneDay extends WorkerOneDay {
    @Override
    public void getUp() {
        System.out.println("测试 起床了！");
    }

    @Override
    public void eatBreakfast() {
        System.out.println("测试 吃早饭！");
    }

    @Override
    public void doWork() {
        System.out.println("测试 开始测试Itender写的代码！");
    }

    @Override
    public void home() {
        System.out.println("测试 测试完Itender的代码，提完Bug下班回家！");
    }
}

