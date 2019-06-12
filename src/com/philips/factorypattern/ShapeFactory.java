package com.philips.factorypattern;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE: {
                return new Circle();
            }

            case SQUARE: {
                return new Square();
            }

            case RECTANGLE: {
                return new Rectangle();
            }

            default: {
                return null;
            }
        }
    }
}
