package com.itender.proxy.service.impl;

import com.itender.proxy.service.Image;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: ITender
 * @CreateTime: 2021-12-11 17:00
 */
@Slf4j
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loadFromDisk: " + fileName);
    }
}
