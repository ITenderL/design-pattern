package com.itender.design.creative.factory.abstract1;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 23:20
 */
public class XiaomiFactory implements ProductFactory {
    @Override
    public PhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
