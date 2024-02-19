package com.itender.design.behavioral.template;

/**
 * @author itender
 * @date 2022/6/29 18:02
 * @desc 模板方法模式测试代码
 */
public class TemplateTest {
    public static void main(String[] args) {
        // 我的一天
        WorkerOneDay itenderWorkOneDay = new ItenderWorkOneDay();
        itenderWorkOneDay.myOneDay();

        // 测试人员的一天
        WorkerOneDay testerWorkOneDay = new TesterWorkOneDay();
        testerWorkOneDay.myOneDay();

        ItenderWorkOneDay itenderWorkOneDay1 = new ItenderWorkOneDay();
        itenderWorkOneDay1.myOneDay();
    }
}

