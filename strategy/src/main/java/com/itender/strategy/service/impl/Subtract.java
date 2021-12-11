package com.itender.strategy.service.impl;

import com.itender.strategy.service.Strategy;

/**
 * @author yuan
 * @create 2021-09-29 11:04
 */
public class Subtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
