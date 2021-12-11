package com.itender.strategy.entity;

import com.itender.strategy.service.Strategy;

/**
 * @author yuan
 * @create 2021-09-29 11:09
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
