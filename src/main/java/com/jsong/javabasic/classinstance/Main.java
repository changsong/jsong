package com.jsong.javabasic.classinstance;

/**
 * Java 对象和类
 */
public class Main {

    public static void main(String[] args){
        /* 创建对象 */
        Dog myPuppy = new Dog( "tommy" );
        /* 通过方法来设定age */
        myPuppy.setAge(10);
        /* 调用另一个方法获取age */
        System.out.println("变量值 : " + myPuppy.getAge());
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.breed );
    }
}
