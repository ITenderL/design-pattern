package com.itender.abstractfactory.service.impl;

import com.itender.abstractfactory.service.Shape;

/**
 * @author yuan
 * @create 2021-09-28 17:08
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Hello I'm a Rectangle;");
    }
}
