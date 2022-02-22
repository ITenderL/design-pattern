package com.itender.design.creative.factory.abstract1;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 23:06
 */
public class HuaweiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("华为手机开机！");
    }

    @Override
    public void shoutDown() {
        System.out.println("华为手机关机！");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话！");
    }

    @Override
    public void sendMsg() {
        System.out.println("华为手机发短信！");
    }
}
