package com.jsong.javabasic.number;

/**
 Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。
 Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用。
 */
public class MathTest {

    public static void main(String[] args){
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);
    }

    // public static void main(String[] args) {
    //     double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
    //     for (double num : nums) {
    //         test(num);
    //     }
    // }
    // floor()
    // 返回小于等于（<=）给定参数的最大整数
    // round()
    // 它表示四舍五入，算法为 Math.floor(x+0.5)，即将原来的数字加上 0.5 后再向下取整，
    // 所以，Math.round(11.5) 的结果为12，Math.round(-11.5) 的结果为-11。
    // ceil()
    // 返回大于等于( >= )给定参数的的最小整数，类型为双精度浮点型。
    //
    // private static void test(double num) {
    //     System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
    //     System.out.println("Math.round(" + num + ")=" + Math.round(num));
    //     System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
    // }
}
