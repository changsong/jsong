package com.jsong.javabasic.extend.construct;

/**
 * @author changsong
 */
public class SuperClass {

    private int n;

    SuperClass() {
        System.out.println("SuperClass()");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}
