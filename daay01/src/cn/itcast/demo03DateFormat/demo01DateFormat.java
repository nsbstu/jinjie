package cn.itcast.demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/*
java.text.DateFormat是日期/时间格式化子类的抽象类
日期/时间格式化子类（如 SimpleDateFormat）允许进行格式化（也就是日期 -> 文本）、解析（文本-> 日期）

 String format(Date date)将一个 Date 格式化为日期/时间字符串
 Date parse(String source)从给定字符串的开始解析文本，以生成一个日期。
DateFormat是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类
java.text.SimpleDateFormat extends DateFormat

构造方法
SimpleDateFormat(String pattern)
          用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
String pattern传递指定格式
y年
M月
d日
H时
m分
s秒


*/
public class demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();
    }
/*
  1创建SimpleDateFormat对象，构造方法中传递指定的模式
  2.调用SimpleDateFormat类中的方法parse,把符合构造方法模式的字符串解析为Date模式
  注意：
  parse声明了一个异常叫ParseException
  如果字符串和构造方法的模式不一样，就会抛出异常
  调用一个抛出异常的方法，就需要处理他，1：throws继续抛出2：try catch自己处理
 */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2021年03月17日 20时47分12秒");
        System.out.println(date);
    }

    /*
    使用DateFormat类中的方法format，把日期格式化为文本
    步骤：
    1创建SimpleDateFormat对象，构造方法中传递指定的模式
    2.调用SimpleDateFormat类中的方法format，按照构造方法中的指定模式，把Date日期格式化为符合的字符串

     */
    private static void demo01() {
        //1创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
//2.调用SimpleDateFormat类中的方法format，按照构造方法中的指定模式，把Date日期格式化为符合的字符串
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);//Wed Mar 17 20:47:12 CST 2021
        System.out.println(d);//2021年03月17日 20时47分12秒
    }
}
