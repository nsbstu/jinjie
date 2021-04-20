package cn.itcast.demo01File;

import java.io.File;

/*
路径：
    绝对路径：
        以盘符开始的路径
        c:\\user\itcast\123.txt
    相对路径：
    相对于当前项目的根目录
    如果使用当前项目的根目录，路径可以简化为
    c:\\user\itcast\123.txt --》简化为 123.txt

 注意：
  1：路径不区分大小写
  2：路径的文件名分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
 */
public class Demo02File {
    public static void main(String[] args) {
        /*
        file类的构造方法
         */
        //show02("D:\\","a.txt");
      //  show02("D:\\","ab.txt");

        show03();
    }
/*
File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
参数:
    String parent:父路径
    String child：子路径
     好处：
       父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都能变化
       父路径是File类型，可以使用file的方法对路径进行一些操作，在使用路径创建对象
 */
    private static void show03() {
        File parent = new File("d:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);//d:\hello.java
    }

    /*
    File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
    参数:
    String parent:父路径
     String child：子路径
     好处：
       父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都能变化
     */
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);//D:\a.txt
    }

    /*
           File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
           参数：
             String pathname：字符串的路径名称
             路径可以是一文件结尾，也可以是以文件夹结尾
             路径可以是相对路径，也可以是绝对路径
             路径可以是存在，也可以是不存在
             创建File对象，只是把字符串路径封装为file对象，不考虑路径的真假情况
            */
    private static void show01() {
        File f1 = new File("D:\\ideaproject\\jinjie\\a.txt");
        System.out.println(f1);//D:\ideaproject\jinjie\a.txt

        File f2 = new File("D:\\ideaproject\\jinjie");
        System.out.println(f2);//D:\ideaproject\jinjie

        File f3 = new File("b.txt");
        System.out.println(f3);//b.txt

    }
}
