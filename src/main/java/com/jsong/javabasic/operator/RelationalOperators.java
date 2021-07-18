package com.jsong.javabasic.operator;

import java.util.Arrays;

/**
 * 关系运算符
 *
 * ==	检查如果两个操作数的值是否相等，如果相等则条件为真。	（A == B）为假。
 * !=	检查如果两个操作数的值是否相等，如果值不相等则条件为真。	(A != B) 为真。
 * > 	检查左操作数的值是否大于右操作数的值，如果是那么条件为真。	（A> B）为假。
 * < 	检查左操作数的值是否小于右操作数的值，如果是那么条件为真。	（A <B）为真。
 * >=	检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。	（A> = B）为假。
 * <=	检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。	（A <= B）为真。
 *
 */
public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        int a = 10;
        int b = 20;

         // a == b = false
         // a != b = true
         // a > b = false
         // a < b = true
         // b >= a = true
         // b <= a = false
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        System.out.println("RelationalOperators.main");

        System.out.println("b = " + b);
        System.out.println("b = " + b);

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }


    }
}
