package com.itender.abstractfactory.service.impl;

import com.itender.abstractfactory.service.Color;

/**
 * @author yuan
 * @create 2021-09-28 17:31
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Hello I'm Green");
    }
}
