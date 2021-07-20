package com.jsong.javabasic.number;

/**
 *这种由编译器特别支持的包装称为装箱，
 * 所以当内置数据类型被当作对象使用的时候，
 * 编译器会把内置类型装箱为包装类。
 * 相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包。
 */
public class NumberTest {

    public static void main(String[] args){
        Integer x = 5;
        x =  x + 10;
        System.out.println(x);
    }
}
