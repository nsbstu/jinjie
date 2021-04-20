package cn.itcast.demo02Iterator.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
/*
long getTime()把日期转为毫秒值
 */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//1615983749659
    }
    /*
    Date的带参构造方法
    Date（long date）：传递毫秒值，把毫秒转换为date日期
     */

    private static void demo02() {

        Date date =new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970

    }

    /*
    date的空参构造方法
    date（）获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);//Wed Mar 17 20:18:31 CST 2021
    }
}
