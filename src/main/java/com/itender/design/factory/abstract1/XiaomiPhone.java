package com.itender.design.factory.abstract1;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 23:08
 */
public class XiaomiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("小米手机开机！");
    }

    @Override
    public void shoutDown() {
        System.out.println("小米手机关机！");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话！");
    }

    @Override
    public void sendMsg() {
        System.out.println("小米手机发短信！");
    }
}
