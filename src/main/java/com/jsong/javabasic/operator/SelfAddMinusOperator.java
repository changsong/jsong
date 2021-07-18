package com.jsong.javabasic.operator;

/**
 * 自增（++）自减（--）运算符是一种特殊的算术运算符，在算术运算符中需要两个操作数来进行运算，而自增自减运算符是一个操作数。
 *
 */
public class SelfAddMinusOperator {
    public static void main(String[] args) {
        int a = 3;//定义一个变量；
        int b = ++a;//自增运算
        int c = 3;
        int d = --c;//自减运算

        //进行自增运算后的值等于4
        //进行自减运算后的值等于2
        System.out.println("进行自增运算后的值等于"+b);
        System.out.println("进行自减运算后的值等于"+d);
        // main2
    }

    /**
     *  * 2、前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
     *  * 3、后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算 实例：
     *
     * @param args
     */
    public static void main2(String[] args){
        int a = 5;//定义一个变量；
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
        //自增运算符前缀运算后a=6，x=12
        //自增运算符后缀运算后b=6，y=10
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
    }
}
