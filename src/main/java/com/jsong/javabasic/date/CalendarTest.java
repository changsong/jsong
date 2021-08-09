package com.jsong.javabasic.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上：
 *
 * @muzijia.com
 */
public class CalendarTest {


    public static void main(String[] args) {
        Date date1=new Date(System.currentTimeMillis());

        Calendar calendar = Calendar.getInstance();
        //获得系统时间

        //格式化时间格式
        SimpleDateFormat simp01=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat simp02=new SimpleDateFormat("yyyy-MM-dd");


        System.out.println("原本的date"+date1);
        System.out.println("初始化的date类型"+simp01.format(date1));
        System.out.println("初始化的date类型"+simp02.format(date1));

        System.out.println("Calendar类获得的时间"+calendar.get(Calendar.YEAR)+":"+(int)((calendar.get(Calendar.MONTH))+1)+":"+calendar.get(Calendar.DAY_OF_MONTH));
        //一般月份会少一，所以月份需要+1，每一个get获得的是字符串，所以需要强转为int
    }

}
