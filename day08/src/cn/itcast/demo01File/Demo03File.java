package cn.itcast.demo01File;

import java.io.File;

/*
public String getAbsolutePath() ：返回此File的绝对路径名字符串。
public String getPath() ：将此File转换为路径名字符串。
public String getName() ：返回由此File表示的文件或目录的名称。
public long length() ：返回由此File表示的文件的长度。

 */
public class Demo03File {
    public static void main(String[] args) {
        show04();
    }
/*
public long length() ：返回由此File表示的文件的长度。
获取的是构造方法指定的文件的大小，以字节为单位
注意：
    文件夹是没有大小概念的，不能获取文件夹的大小
    如果构造方法中给出的路径不存在，那么返回的是0
 */
    private static void show04() {
        File f1 = new File("D:\\ideaproject\\jinjie\\daay01\\src\\cn\\itcast\\demo01Collection\\Person");
        long l1 = f1.length();
        System.out.println(l1);
        File f2 = new File("D:\\ideaproject\\jinjie\\b.jpg");
        long l2 = f2.length();
        System.out.println(l2);

        File f3 = new File("D:\\ideaproject\\jinjie");
        long l3 = f3.length();
        System.out.println(l3);

    }

    /*
    public String getName() ：返回由此File表示的文件或目录的名称。
    获取构造方法传递的路径的结尾部分（文件/文件夹）

     */
    private static void show03() {
        File f1 = new File("D:\\ideaproject\\jinjie\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);//a.txt
        File f2 = new File("D:\\ideaproject\\jinjie");
        String name2 = f2.getName();
        System.out.println(name2);//jinjie

    }



    /*
    public String getPath() ：将此File转换为路径名字符串。
    toString方法调用的是getPath方法

     */
    private static void show02() {
        File f1 = new File("D:\\ideaproject\\jinjie\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);//D:\ideaproject\jinjie\a.txt
        System.out.println(path2);//a.txt

        System.out.println(f1);//D:\ideaproject\jinjie\a.txt
        System.out.println(f1.toString());//D:\ideaproject\jinjie\a.txt
    }

    /*
    public String getAbsolutePath() ：返回此File的绝对路径名字符串。
    获取构造方法中传递的路径
    无论路径是绝对还是相对，返回的都是绝对路径
     */
    private static void show01() {
        File f1 = new File("D:\\ideaproject\\jinjie\\a.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);//D:\ideaproject\jinjie\a.txt

        File f2 = new File("a.txt");
        String absolutePath1 = f2.getAbsolutePath();
        System.out.println(absolutePath1);//D:\ideaproject\jinjie\a.txt
    }
}
