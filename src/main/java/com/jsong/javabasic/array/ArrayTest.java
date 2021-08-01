package com.jsong.javabasic.array;

/**
 * 数组对于每一门编程语言来说都是重要的数据结构之一，当然不同语言对数组的实现及处理也不尽相同。
 *
 * Java 语言中提供的数组是用来存储固定大小的同类型元素。
 * 你可以声明一个数组变量，如 numbers[100] 来代替直接声明 100 个独立变量 number0，number1，....，number99。
 * 本教程将为大家介绍 Java 数组的声明、创建和初始化，并给出其对应的代码。
 *
 * @muzijia.com
 */
public class ArrayTest {

    public static void main(String[] args) {

        // Java 数组定义
        // 首选的方法
        int[] arrayRefVar;
        // 效果相同，但不是首选方法
        int arrayRefVar2[]; // 风格是来自 C/C++ 语言

        // new操作符来创建数组
        int[] arrayRefVarNew = new int[10];
        //一、使用 dataType[arraySize] 创建了一个数组。
        // 二、把新创建的数组的引用赋值给变量 arrayRefVarNew。

        // 创建及初始化数组
        int[] intArr = {121, 1212, 1212};


        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);
    }
}
