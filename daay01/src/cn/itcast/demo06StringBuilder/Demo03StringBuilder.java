package cn.itcast.demo06StringBuilder;
/*
public String toString()`：
将当前StringBuilder对象转换为String对象。
String->StringBuilder;可以使用StringBuilder的构造方法
构造一个字符串生成器，并初始化为指定的字符串内容
Stringbuilde-》string 使用tostring（）；

 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //String->StringBuilder
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println(bu);
        //Stringbuilde-》string
        String s = bu.toString();
        System.out.println("s:" + s);
    }
}
