package com.itender.design.creative.builder;

/**
 * @Author: ITender
 * @Description: 建造者模式，构建与表示分离
 * @CreateTime: 2022-02-18 00:04
 */
public class BuilderHouse {
    public static void main(String[] args) {
        // 创建指挥者
        Director director = new Director();
        // 创建工人，指挥者指挥工人建房子
        Product house = director.builder(new Worker());
        System.out.println(house.toString());

    }
}
