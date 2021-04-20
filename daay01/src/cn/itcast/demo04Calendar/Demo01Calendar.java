package cn.itcast.demo04Calendar;

import java.util.Calendar;

/*
Calendar是抽象类，提供了YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，
static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
 */
public class Demo01Calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();//多态
        System.out.println(c);
    }
}
