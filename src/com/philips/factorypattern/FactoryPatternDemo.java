package com.philips.factorypattern;

import java.util.ArrayList;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of com.philips.factorypattern.Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);

        //call draw method of com.philips.factorypattern.Circle
        shape1.draw();
        //get an object of com.philips.factorypattern.Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);

        //call draw method of com.philips.factorypattern.Rectangle
        shape2.draw();

        //get an object of com.philips.factorypattern.Square and call its draw method.
        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);

        //call draw method of square
        shape3.draw();

        //Below code was added to check additional method inside a class
        ArrayList<String> arr = new ArrayList<String>(4);
        arr.add("1");
        arr.add("2");
        arr.add("4");
        System.out.println(Circle.getFirst(arr));
    }
}
