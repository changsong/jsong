package com.jsong.javabasic.enumtest;

/**
 * Java 枚举是一个特殊的类，一般表示一组常量，
 * 比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
 *
 * @muzijia.com
 */
public enum Color {
    RED, GREEN, BLUE;

    // 构造函数
    private Color()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}
