package com.jsong.javabasic.enumtest;

/**
 * 测试Enum 枚举类也可以声明在内部类中
 */
public class InnerClassTest {
    enum Color
    {
        RED, GREEN, BLUE;
    }

    // 执行输出结果
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
