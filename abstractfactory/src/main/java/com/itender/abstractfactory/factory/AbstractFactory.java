package com.itender.abstractfactory.factory;

import com.itender.abstractfactory.service.Color;
import com.itender.abstractfactory.service.Shape;

/**
 * @author yuan
 * @create 2021-09-28 17:34
 */
public abstract class AbstractFactory {

    /**
     * 获取颜色
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape);
}
