package com.jsong.javabasic.polymorphism.shape;

import com.jsong.javabasic.polymorphism.shape.Shape;

/**
 * 圆形
 */
public class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Circle.draw()");
    }
}
