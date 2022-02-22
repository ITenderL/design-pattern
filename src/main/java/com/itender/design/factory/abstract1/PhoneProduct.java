package com.itender.design.factory.abstract1;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 23:04
 */
public interface PhoneProduct {
    /**
     * 手机开机
     */
    void start();

    /**
     * 关机
     */
    void shoutDown();

    /**
     * 打电话
     */
    void call();

    /**
     * 发短信
     */
    void sendMsg();
}
