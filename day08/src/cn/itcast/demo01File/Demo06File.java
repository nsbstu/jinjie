package cn.itcast.demo01File;

import java.io.File;

/*
 目录的遍历
public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。

public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
注意：
 list方法和listFiles方法遍历的是构造方法中给出的目录
 如果构造方法中给出的目录路径不存在，会抛出空指针异常
 如果构造方法给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo06File {
    public static void main(String[] args) {
        show02();
    }
/*
public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹的名称，
把文件/文件夹封装为file对象，多个file对象存储到file数组中


 */
    private static void show02() {

        File f1 = new File("D:\\ideaproject\\jinjie\\day08");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    /*
    public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
    遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
    隐藏的文件/文件夹也能遍历出来
     */
    private static void show01() {
        //File f1 = new File("D:\\ideaproject\\jinjie\\day08");
        File f1 = new File("D:\\ideaproject\\jinjie\\daaaay08");//NullPointerException
       // File f1 = new File("D:\\ideaproject\\jinjie\\day08\\1.txt");//NullPointerException

        String[] arr = f1.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }
}
