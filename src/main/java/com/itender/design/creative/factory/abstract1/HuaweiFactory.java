package com.itender.design.creative.factory.abstract1;

/**
 * @Author: ITender
 * @Description:
 * @CreateTime: 2022-02-17 23:21
 */
public class HuaweiFactory implements ProductFactory {
    @Override
    public PhoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new HuaweiRouter();
    }
}
