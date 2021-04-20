package cn.itcast.demo06StringBuilder;
/*
StringBuilder()
          构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
 StringBuilder(String str)
          构造一个字符串生成器，并初始化为指定的字符串内容。

 */
public class demo01StringBuilder {
    public static void main(String[] args) {
        //无参构造
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:" + bu1);
        //含参构造
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2" + bu2);

    }
}
