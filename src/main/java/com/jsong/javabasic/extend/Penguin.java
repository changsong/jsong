package com.jsong.javabasic.extend;

/**
 * 这个Animal类就可以作为一个父类，然后企鹅类和老鼠类继承这个类之后，
 * 就具有父类当中的属性和方法，子类就不会存在重复的代码，维护性也提高，
 * 代码也更加简洁，提高代码的复用性（复用性主要是可以多次使用，不用再多次写同样的代码）
 */
public class Penguin extends Animal {
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }
}
