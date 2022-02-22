package com.itender.design.creative.factory.abstract1;

/**
 * @Author: ITender
 * @CreateTime: 2022-02-17 23:16
 */
public interface ProductFactory {
    /**
     * 手机产品族
     * @return
     */
    PhoneProduct phoneProduct();

    /**
     * 路由器产品族
     * @return
     */
    RouterProduct routerProduct();
}
