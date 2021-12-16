package com.itender.proxy.service.impl;

import com.itender.proxy.service.Image;

/**
 * @author yuanhewei
 * @createTime 2021-12-11 17:12
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}