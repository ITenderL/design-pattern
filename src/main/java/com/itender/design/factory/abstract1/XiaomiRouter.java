package com.itender.design.factory.abstract1;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 23:13
 */
public class XiaomiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由器开机！");
    }

    @Override
    public void shoutDown() {
        System.out.println("小米路由器关机！");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器开启wifi！");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置密码！");
    }
}
