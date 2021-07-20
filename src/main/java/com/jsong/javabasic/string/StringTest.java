package com.jsong.javabasic.string;

/**
 * String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上：
 *
 */
public class StringTest {


    public static void main(String[] args) {
        String s1 = "Runoob";              // String 直接创建
        String s2 = "Runoob";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Runoob");   // String 对象创建
        String s5 = new String("Runoob");   // String 对象创建
    }
}
