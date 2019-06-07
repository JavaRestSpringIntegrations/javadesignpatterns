package com.philips.factorypattern;

import java.util.List;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside com.philips.factorypattern.Circle::draw() method.");
    }

    public static String getFirst(List<String> input) {
        if(input != null && !input.isEmpty()) {
            return input.get(2);
        }
        return null;
    }

    
}