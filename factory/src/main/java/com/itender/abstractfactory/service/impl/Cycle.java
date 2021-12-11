package com.itender.abstractfactory.service.impl;

import com.itender.abstractfactory.service.Shape;

/**
 * @author yuan
 * @create 2021-09-28 17:05
 */
public class Cycle implements Shape {

    @Override
    public void draw() {
        System.out.println("Hello I'm a cycle;");
    }
}
