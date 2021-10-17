package com.jsong.javabasic.override;

/**
 * @author changsong
 */
public class TestDog {
    public static void main(String args[]){
        // Animal 对象
        Animal a = new Animal();
        // Dog 对象
        Animal  b = new Dog();
        // 执行 Animal 类的方法
        a.move();
        //执行 Dog 类的方法
        // 当需要在子类中调用父类的被重写方法时，要使用 super 关键字。
        b.move();
    }
}
