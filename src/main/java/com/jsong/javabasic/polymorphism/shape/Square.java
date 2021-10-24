package com.jsong.javabasic.polymorphism.shape;

import com.jsong.javabasic.polymorphism.shape.Shape;

/**
 * 多态-方形
 *
 * @author changsong
 */
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square.draw()");
    }
}
