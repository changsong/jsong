package com.jsong.javabasic.override;

/**
 * @author changsong
 */
public class Dog extends Animal{
    @Override
    public void move(){
        System.out.println("狗可以跑和走");
    }
}
