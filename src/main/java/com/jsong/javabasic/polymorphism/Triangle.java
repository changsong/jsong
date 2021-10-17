package com.jsong.javabasic.polymorphism;

/**
 * 多态-三角形
 *
 * @author changsong
 */
public class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle.draw()");
    }
}
