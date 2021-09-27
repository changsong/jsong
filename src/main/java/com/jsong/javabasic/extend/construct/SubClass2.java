package com.jsong.javabasic.extend.construct;

/**
 * @author changsong
 */
public class SubClass2 extends SuperClass{

    private int n;

    /**
     * 调用父类中带有参数的构造器
     */
    SubClass2(){
        super(300);
        System.out.println("SubClass2");
    }

    /**
     * 自动调用父类的无参数构造器
     * @param n
     */
    public SubClass2(int n){
        System.out.println("SubClass2(int n):"+n);
        this.n = n;
    }
}
