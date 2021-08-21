package com.jsong.javabasic.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 使用 BufferedReader 在控制台读取字符
 */
public class StreamTest {

    /**
     * 使用 BufferedReader 在控制台读取字符
     *
     * @param args
     * @throws IOException
     */
    // public static void main(String[] args) throws IOException {
    //     char c;
    //     // 使用 System.in 创建 BufferedReader
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     System.out.println("输入字符, 按下 'q' 键退出。");
    //     // 读取字符
    //     do {
    //         c = (char) br.read();
    //         System.out.println(c);
    //     } while (c != 'q');
    // }

    /**
     * 从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
