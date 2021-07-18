package com.jsong.javabasic.operator;

/**
 * 算术运算符
 * +	加法 - 相加运算符两侧的值	A + B 等于 30
 * -	减法 - 左操作数减去右操作数	A – B 等于 -10
 * *	乘法 - 相乘操作符两侧的值	A * B等于200
 * /	除法 - 左操作数除以右操作数	B / A等于2
 * ％	取余 - 左操作数除以右操作数的余数	B%A等于0
 * ++	自增: 操作数的值增加1	B++ 或 ++B 等于 21
 * --	自减: 操作数的值减少1	B-- 或 --B 等于 19
 *
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
    }
}
