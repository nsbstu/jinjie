package cn.itcast.demo07Integer;
/*
基本类型与字符串类型的转换
基本类型-》字符串(String)
1.基本类型的值+ ""最简单的方法（工作中常用）
2.包装类的静态方法toString（参数），不是Object的toString（）重载
static String toString(int i) 返回一个表示指定整数的 String 对象。
 3.String类的valueof（参数）
 static String valueOf(int i) 返回 int 参数的字符串表示形式。
字符串--》基本类型
使用包装类的静态方法parsexxxx(数值类型的字符串)
Integer类：static int parseInt（String s ）
Double类：static double parseDouble（String s ）

 */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型-》字符串(String)
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);//100200


        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);//100200

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);//100200

        //字符串--》基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i - 10);//90
        int a = Integer.parseInt("a");
        System.out.println(a);//NumberFormatException



    }
}
