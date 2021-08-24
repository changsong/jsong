package com.jsong.javabasic.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    /**
     * 声明有两个元素的一个数组，当代码试图访问数组的第四个元素的时候就会抛出一个异常。
     *
     * @param args
     */
    // public static void main(String[] args) {
    //     try {
    //         int a[] = new int[2];
    //         System.out.println("Access element three :" + a[3]);
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Exception thrown  :" + e);
    //         e.printStackTrace();
    //     }
    //     System.out.println("Out of the block");
    // }


    // /**
    //  * 多重捕获块
    //  * <p>
    //  * 可以在 try 语句后面添加任意数量的 catch 块。
    //  * 如果保护代码中发生异常，异常被抛给第一个 catch 块。
    //  * 如果抛出异常的数据类型与 ExceptionType1 匹配，它在这里就会被捕获。
    //  * 如果不匹配，它会被传递给第二个 catch 块。
    //  * 如此，直到异常被捕获或者通过所有的 catch 块。
    //  *
    //  * @param args
    //  */
    // public static void main(String[] args) {
    //     try {
    //         String fileName = "test.txt";
    //         FileInputStream file = new FileInputStream(fileName);
    //         int x = (byte) file.read();
    //     } catch (FileNotFoundException f) { // Not valid!
    //         f.printStackTrace();
    //     } catch (IOException i) {
    //         i.printStackTrace();
    //     }
    // }

    /**
     * finally关键字
     * <p>
     * finally 关键字用来创建在 try 代码块后面执行的代码块。
     * 无论是否发生异常，finally 代码块中的代码总会被执行。
     * 在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。
     * finally 代码块出现在 catch 代码块最后
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }


}
