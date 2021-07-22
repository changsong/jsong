package com.jsong.javabasic.operator;

/**
 * 该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。
 *
 * instanceof运算符使用格式如下：
 * ( Object reference variable ) instanceof  (class/interface type)
 */
public class InstanceofOperators {
    public static void main(String[] args) {
        String name = "James";
        // 由于 name 是 String 类型，所以返回真
        boolean result = name instanceof String;
        System.out.println("result = " + result);
    }
}
