package com.itender.strategy.service;

/**
 * @author yuan
 * @create 2021-09-29 11:01
 */
public interface Strategy {

    /**
     * 行为操作
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
