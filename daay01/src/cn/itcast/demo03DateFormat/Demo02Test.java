package cn.itcast.demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
计算一个人的出生多少天
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        //1.使用scanner的next获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期，格式yyyy-MM-dd");
        String birthdayDateString = sc.next();
        //2.使用DateFormat的parse，把string解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        //3.把date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        //.4获取当前日期转换为毫秒值
        long todayTime = new Date().getTime();
        //5.当前日期的毫秒值-出生日期的毫秒值
        long time = todayTime - birthdayDateTime;
        //6.差值的毫秒值转换为天
        System.out.println(time/1000/60/60/24);


    }
}
