package cn.itcast.demo01File;

import java.io.File;
import java.io.IOException;

/*
创建删除功能的方法

public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
public boolean delete() ：删除由此File表示的文件或目录。
public boolean mkdir() ：创建由此File表示的目录。
public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。

 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        show03();

    }

    /*
    public boolean delete() ：删除由此File表示的文件或目录。
    此方法，可以删除构造方法路径中给出的文件/文件夹
    返回值：布尔
    true：删除成功
    false：文件夹中有内容不会删除；构造方法中文件路径不存在

    注意：
     delect方法是直接在硬盘删除文件/文件夹，不走回车站，删除要谨慎
     */
    private static void show03() {
        File f1 = new File("day08\\新建文件夹");
        boolean b1 = f1.delete();
        System.out.println("b1:" + b1);

        File f2 = new File("day08\\abc.txt");
        boolean b2 = f2.delete();
        System.out.println("b2:" + b2);

    }

    /*
    public boolean mkdir() ：创建由此File表示的目录。只能创建单级空文件夹
    public boolean mkdirs() ：能创建单级空文件夹，也能创建多级文件夹
     public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出(构造方法的参数）
        返回值：布尔类型
        true：文件夹不存在，创建文件，返回true
        false：文件夹存在，不会创建，返回false；构造方法中给出的路径不存在，返回false
        注意/；
        此方法只能创建文件夹，不能创建文件
     */
    private static void show02() {
        File f1 = new File("D:\\ideaproject\\jinjie\\day08\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1 :" + b1);
        File f2 = new File("D:\\ideaproject\\jinjie\\day08\\111\\222\\333\\444");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:" + b2);
        File f3 = new File("D:\\ideaproject\\jinjie\\day08\\abc.txt");
        boolean b3 = f3.mkdirs();
        System.out.println("b3:" + b3);//不要被名字迷惑，要看类型

        File f4 = new File("D:\\ideaproject\\jinjie\\daaaay08\\ccc");
        boolean b4 = f4.mkdir();
        System.out.println("b4:" + b4);//路径不存在不会创建文件夹

    }
    /*
    public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    创建文件的路径和名称在构造方法中给出(构造方法的参数）
    返回值：布尔类型
    true：文件不存在，创建文件，返回true
    false：文件存在，不会创建，返回false
    注意/；
    此方法只能创建方法，不能创建文件夹
    创建文件的路径必须存在，否则回抛出异常

 //public boolean createNewFile() throws IOException 有异常需要处理，try，，catch 或者throws
     */

    private static void show01() throws IOException {
        File f1 = new File("D:\\ideaproject\\jinjie\\day08\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1 :" + b1);//b1 :false


        File f2 = new File("day08\\2.txt");
        boolean b2 = f2.createNewFile();
        System.out.println("b2: " + b2);//b2: true

        File f3 = new File("day08\\新建文件夹");
        System.out.println(f3.createNewFile());//不要被名字迷惑，要看类型

       /* File f4 = new File("daaay08\\3.txt");
        System.out.println(f4.createNewFile());//路径不存在，抛出异常*/
    }
}
