package com.jsong.javabasic.classinstance;

/**
 * Java 对象和类
 *
 * 类可以看成是创建 Java 对象的模板。
 *
 *构造方法
 * 每个类都有构造方法。如果没有显式地为类定义构造方法，Java 编译器将会为该类提供一个默认构造方法。
 * 在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
 */
public class Dog {

    String breed;
    int size;
    String colour;
    int age;

    public Dog(){
    }
    public Dog(String name){
        // 这个构造器仅有一个参数：name
    }

    void eat() {
    }

    void run() {
    }

    void sleep(){
    }

    void name(){
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
