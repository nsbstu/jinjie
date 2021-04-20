package cn.itcast.demo04Calendar;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/*
`public int get(int field)`：返回给定日历字段的值。
- `public void set(int field, int value)`：将给定的日历字段设置为给定值。
- `public abstract void add(int field, int amount)`：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
- `public Date getTime()`：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
参数
int field:日历的字段，可以用Calendar类的静态成员变量获取
| ------------ | -------------------- |
| YEAR         | 年                    |
| MONTH        | 月（从0开始，可以+1使用）       |
| DAY_OF_MONTH | 月中的天（几号）             |
| HOUR         | 时（12小时制）             |
| HOUR_OF_DAY  | 时（24小时制）             |
| MINUTE       | 分                    |
| SECOND       | 秒                    |
| DAY_OF_WEEK  | 周中的天（周几，周日为1，可以-1使用） |

 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo04();
    }
/*
public Date getTime()`：
返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
把日历对像转为日期对象
 */
    private static void demo04() {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }

    /*
    `public abstract void add(int field, int amount)`：
    根据日历的规则，为给定的日历字段添加或减去指定
    int amount：增加+负数-
     */
    private static void demo03() {

        //获取Calendar对象
        Calendar c = Calendar.getInstance();

        //增加两年
        c.add(Calendar.YEAR,2);
        //减少三月
        c.add(Calendar.MONDAY,-3);



        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int monday = c.get(Calendar.MONDAY);
        System.out.println(monday);

        //int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
    /*
    - `public void set(int field, int value)`：将给定的日历字段设置为给定值。
     */

    private static void demo02() {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();

        //设置年
        c.set(Calendar.YEAR,999);
        //设置月
        c.set(Calendar.MONDAY,9);
        //设置天
        c.set(Calendar.DATE,9);

        //同时设置年月日,方法的重载
        c.set(8888,8,8);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int monday = c.get(Calendar.MONDAY);
        System.out.println(monday);

        //int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    /*
    public int get(int field)`：返回给定日历字段的值。
     */
    private static void demo01() {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int monday = c.get(Calendar.MONDAY);
        System.out.println(monday);

        //int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);

    }
}
