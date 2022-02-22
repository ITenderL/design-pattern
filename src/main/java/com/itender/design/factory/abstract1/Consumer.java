package com.itender.design.factory.abstract1;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 23:25
 */
public class Consumer {
    public static void main(String[] args) {
        System.out.println("===========小米产品===============");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        PhoneProduct xiaomiPhone = xiaomiFactory.phoneProduct();
        xiaomiPhone.call();
        xiaomiPhone.sendMsg();

        RouterProduct xiaomiRouter = xiaomiFactory.routerProduct();
        xiaomiRouter.openWifi();
        xiaomiRouter.setting();
    }
}
