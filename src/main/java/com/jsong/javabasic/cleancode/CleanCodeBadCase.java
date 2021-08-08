package com.jsong.javabasic.cleancode;

/**
 * 代码洁癖例子
 * @author test
 */
public class CleanCodeBadCase {

    public static final int TEN = 10;
    public static final int TWENTY = 20;
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int water = 0;

        System.out.println("water = " + water);

        System.out.println("a == b = " + (a == b));
        System.out.println("b = " + b);

        if (a == TEN) {
           b += TWENTY;
        }

        System.out.println("b = " + b);

        // 迭代 args 进行输出
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("arg = " + arg);
        }
    }
}
