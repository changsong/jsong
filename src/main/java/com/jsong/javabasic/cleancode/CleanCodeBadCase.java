package com.jsong.javabasic.cleancode;

/**
 * 代码洁癖例子
 */
public class CleanCodeBadCase {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int water = 0;

        System.out.println("witer = " + water);

        System.out.println("a == b = " + (a == b));
        System.out.println("b = " + b);

        if (a == 10) b += 20;

        System.out.println("b = " + b);

        // 迭代 args 进行输出
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("arg = " + arg);
        }

    }
}
