package com.jsong.javabasic.modifier;

/**
 * 作用：
 * 1. 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
 * 2.禁止指令重排序优化。（是指CPU采用了允许将多条指令不按程序规定的顺序分开发送给各相应电路单元处理）
 *
 *通常来说，使用volatile必须具备以下2个条件：
 * 　　1）对变量的写操作不依赖于当前值
 * 　　2）该变量没有包含在具有其他变量的不变式中
 */
public class VolatileTest {

//    https://www.cnblogs.com/dolphin0520/p/3920373.html
//
//    class Singleton{
//        private volatile static Singleton instance = null;
//
//        private Singleton() {
//
//        }
//
//        public static Singleton getInstance() {
//            if(instance==null) {
//                synchronized (Singleton.class) {
//                    if(instance==null)
//                        instance = new Singleton();
//                }
//            }
//            return instance;
//        }
//    }
}
