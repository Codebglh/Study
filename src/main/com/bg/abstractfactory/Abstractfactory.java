package com.bg.abstractfactory;

import com.bg.factory.Shape;

public abstract class Abstractfactory {
    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String color);

    public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
}
