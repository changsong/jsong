package com.jsong.javabasic.scanner;

import java.util.Scanner;

/**
 * java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入。
 */
public class ScannerTest {

    /**
     * 字符串
     *
     * @param args
     */
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     // 从键盘接收数据
    //
    //     // next方式接收字符串
    //     System.out.println("next方式接收：");
    //     // 判断是否还有输入
    //     if (scan.hasNext()) {
    //         String str1 = scan.next();
    //         System.out.println("输入的数据为：" + str1);
    //     }
    //     scan.close();
    // }

    /**
     * 字符串行
     *
     * @param args
     */
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     // 从键盘接收数据
    //
    //     // nextLine方式接收字符串
    //     System.out.println("nextLine方式接收：");
    //     // 判断是否还有输入
    //     if (scan.hasNextLine()) {
    //         String str2 = scan.nextLine();
    //         System.out.println("输入的数据为：" + str2);
    //     }
    //     scan.close();
    // }

    /**
     * 判断输入数值类型
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }
}
