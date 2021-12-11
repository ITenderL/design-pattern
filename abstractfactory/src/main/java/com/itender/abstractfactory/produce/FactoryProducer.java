package com.itender.abstractfactory.produce;

import com.itender.abstractfactory.factory.AbstractFactory;
import com.itender.abstractfactory.factory.ColorFactory;
import com.itender.abstractfactory.factory.ShapeFactory;
import org.springframework.util.StringUtils;

/**
 * @author yuan
 * @create 2021-09-28 17:41
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (StringUtils.isEmpty(factoryType)) {
            return null;
        }
        if ("color".equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        }
        if ("shape".equalsIgnoreCase(factoryType)) {
            return new ShapeFactory();
        }
        return null;
    }
}
