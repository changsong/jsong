package com.jsong.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtil {

    private static final BufferedReader KEYBOARD_INPUT = new BufferedReader(new InputStreamReader(System.in));

    private InputUtil() {
    }

    public static String getString(String prompt) {
        //数据接受标记
        boolean flag = true;
        String str = null;
        while (flag) {
            System.out.println(prompt);
            try {
                // 读取一行数据
                str = KEYBOARD_INPUT.readLine();
                if (str == null || "".equals(str)) {
                    System.out.println("数据输入错误，不允许为空！");
                } else {
                    flag = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

}
