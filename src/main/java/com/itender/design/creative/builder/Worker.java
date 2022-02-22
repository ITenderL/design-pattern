package com.itender.design.creative.builder;

/**
 * @Author: ITender
 * @Description: 具体建造者，工人
 * @CreateTime: 2022-02-17 23:55
 */
public class Worker extends Builder {

    private Product product;

    // public Worker(Product product) {
    //     this.product = product;
    // }

    /**
     * product不是传进来的，而是工人自己创建的。
     */
    public Worker() {
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("打地基");
        System.out.println("工人打地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋水泥");
        System.out.println("工人钢筋水泥工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺设电线");
        System.out.println("工人铺设电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷墙皮");
        System.out.println("工人粉刷墙皮");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
