package com.itender.design.creative.factory.abstract1;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 23:10
 */
public class HuaweiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开机！");
    }

    @Override
    public void shoutDown() {
        System.out.println("华为路由器关机！");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器开启wifi！");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置密码！");
    }
}
