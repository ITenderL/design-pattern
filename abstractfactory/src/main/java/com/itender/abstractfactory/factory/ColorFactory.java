package com.itender.abstractfactory.factory;

import com.itender.abstractfactory.service.Color;
import com.itender.abstractfactory.service.Shape;
import com.itender.abstractfactory.service.impl.*;
import org.springframework.util.StringUtils;

/**
 * @author yuan
 * @create 2021-09-28 17:09
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (StringUtils.isEmpty(color)) {
            return null;
        }
        switch (color) {
            case "red":
                return new Red();
            case "yellow":
                return new Yellow();
            case "green":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
