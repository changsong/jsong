package com.jsong.javabasic.modifier;

/**
 * synchronized修饰方法时要注意以下几点：
 * 1. synchronized关键字不能继承。
 * 2. 修饰一个静态方法，静态方法是属于类的而不属于对象的，synchronized修饰的静态方法锁定的是这个类的所有对象。
 *
 * 1、无论synchronized关键字加在方法上还是对象上，如果它作用的对象是非静态的，
 * 则它取得的锁是对象；如果synchronized作用的对象是一个静态方法或一个类，则它取得的锁是对类，该类所有的对象同一把锁。
 * 2、每个对象只有一个锁（lock）与之相关联，谁拿到这个锁谁就可以运行它所控制的那段代码。
 * 3、实现同步是要很大的系统开销作为代价的，甚至可能造成死锁，所以尽量避免无谓的同步控制
 *
 */
class SyncThread implements Runnable {
    private static int count;
    public SyncThread() {
        count = 0;
    }
    public  void run() {
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("线程名:"+Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public int getCount() {
        return count;
    }
}

public class SynchronizedTest {
    public static void main(String[] args) {
        System.out.println("使用关键字synchronized");
        SyncThread syncThread = new SyncThread();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}

