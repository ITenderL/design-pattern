package com.itender.abstractfactory.factory;

import com.itender.abstractfactory.service.Color;
import com.itender.abstractfactory.service.Shape;
import com.itender.abstractfactory.service.impl.Cycle;
import com.itender.abstractfactory.service.impl.Rectangle;
import com.itender.abstractfactory.service.impl.Square;
import org.springframework.util.StringUtils;

/**
 * @author yuan
 * @create 2021-09-28 17:09
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (StringUtils.isEmpty(shapeType)) {
            return null;
        }
        switch (shapeType) {
            case "cycle":
                return new Cycle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
