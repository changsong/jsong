package com.jsong.javabasic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上：
 *
 * @muzijia.com
 */
public class DateTest {


    public static void main(String[] args) {
        // 初始化 Date 对象
        Date date = new Date();

        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());


        // SimpleDateFormat 是一个以语言环境敏感的方式来格式化和分析日期的类。
        // SimpleDateFormat 允许你选择任何用户自定义日期时间格式来运行。
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));


        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",dNow);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",dNow);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",dNow);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",dNow);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",dNow);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",dNow);

        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", date);

        parseDate();

        testSleep();
    }

    public static void parseDate() {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        System.out.println("\n");

        String input = "1818-11-11";
        System.out.println(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }

    /**
     * sleep()使当前线程进入停滞状态（阻塞当前线程），让出CPU的时间、
     * 目的是不让当前线程独自霸占该进程所获的CPU资源，以留一定时间给其他线程执行的机会。
     * 你可以让程序休眠一毫秒的时间或者到您的计算机的寿命长的任意段时间。例如，下面的程序会休眠3秒
     */
    public static void testSleep() {
        try {
            System.out.println(new Date( ) + "\n");
            // 休眠3秒
            Thread.sleep(1000*3);
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
