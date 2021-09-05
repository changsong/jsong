package com.jsong.javabasic.extend;

public class ExtendTest {
    public static void main(String[] args) {
        Animal a = new Animal("animal", 1);
        a.eat();
        Mouse d = new Mouse("mouse1", 12);
        d.eat();

        // super关键字
        // this 关键字
        Dog dog = new Dog("dog1", 9);
        dog.eatTest();
    }
}
