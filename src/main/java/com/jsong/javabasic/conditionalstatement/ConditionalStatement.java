package com.jsong.javabasic.conditionalstatement;

/**
 Java 条件语句 - if...else
 一个 if 语句包含一个布尔表达式和一条或多条语句。

 if 语句的语法如下：
 if(布尔表达式)
 {
 //如果布尔表达式为true将执行的语句
 }
 */
public class ConditionalStatement {

    public static void main(String args[]){
        int x = 10;

        if( x < 20 ){
            System.out.print("这是 if 语句");
        }
    }

    // public static void main(String args[]){
    //     int x = 30;
    //
    //     if( x == 10 ){
    //         System.out.print("Value of X is 10");
    //     }else if( x == 20 ){
    //         System.out.print("Value of X is 20");
    //     }else if( x == 30 ){
    //         System.out.print("Value of X is 30");
    //     }else{
    //         System.out.print("这是 else 语句");
    //     }
    // }

    // if(布尔表达式 1){
    //     ////如果布尔表达式 1的值为true执行代码
    //     if(布尔表达式 2){
    //         ////如果布尔表达式 2的值为true执行代码
    //     }
    // }
    // public static void main(String args[]){
    //     int x = 30;
    //     int y = 10;
    //
    //     if( x == 30 ){
    //         if( y == 10 ){
    //             System.out.print("X = 30 and Y = 10");
    //         }
    //     }
    // }
}
