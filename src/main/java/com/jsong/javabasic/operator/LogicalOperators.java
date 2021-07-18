package com.jsong.javabasic.operator;

/**
 * 逻辑运算符
 *
 &&	称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。	（A && B）为假。
 | |	称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。	（A | | B）为真。
 ！	称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。	！（A && B）为真
 *
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));

        // a && b = false
        // a || b = true
        // !(a && b) = true
    }

    // public static void main(String[] args){
    //     int a = 5;//定义一个变量；
    //     boolean b = (a<4)&&(a++<10);
    //     System.out.println("使用短路逻辑运算符的结果为"+b);
    //     System.out.println("a的结果为"+a);
    // }
    // 该程序使用到了短路逻辑运算符(&&)，首先判断 a<4 的结果为 false，
    // 则 b 的结果必定是 false，所以不再执行第二个操作 a++<10 的判断，所以 a 的值为 5。
}
