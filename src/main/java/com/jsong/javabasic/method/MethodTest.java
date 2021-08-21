package com.jsong.javabasic.method;

/**
 * Java方法是语句的集合，它们在一起执行一个功能。
 *
 * 方法是解决一类问题的步骤的有序组合
 * 方法包含于类或对象中
 * 方法在程序中被创建，在其他地方被引用
 */
public class MethodTest {

    /**
     * 1. 使程序变得更简短而清晰。
     * 2. 有利于程序维护。
     * 3. 可以提高程序开发的效率。
     * 4. 提高了代码的重用性。
     *
     * @param args
     */
    public static void main(String[] args) {
        int result = max(100, 12);
        System.out.println("print {}" + result);

        // 可变参数
        printMax(1.0, 12.0, 212.0);
    }

    /**
     * 返回两个整型变量数据的较大值
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2){
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    /**
     *JDK 1.5 开始，Java支持传递同类型的可变参数给一个方法。
     * 在方法声明中，在指定参数类型后加一个省略号(...)
     * 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。
     *
     * @param numbers
     */
    public static void printMax( double... numbers){
        if (numbers.length == 0) {
            System.out.println("No argument passed"); return;
        }
    }
}
