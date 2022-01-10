package com.jsong.javabasic.enumtest;

/**
 * 测试Enum
 */
public class Test {
    // 执行输出结果
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);

        // 使用 for 语句来迭代枚举元素
        for (Color myVar : Color.values()) {
            System.out.println(myVar);
        }

        // 调用 values()
        Color[] arr = Color.values();

        // 迭代枚举
        for (Color col : arr){
            // 查看索引
            System.out.println(col + " at index " + col.ordinal());
        }

        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));

        // 枚举跟普通类一样可以用自己的变量、方法和构造函数，
        // 构造函数只能使用 private 访问修饰符，所以外部无法调用。
        System.out.println(c1);
        c1.colorInfo();
    }
}
