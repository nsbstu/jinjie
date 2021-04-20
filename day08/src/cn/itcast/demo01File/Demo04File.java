package cn.itcast.demo01File;

import java.io.File;

/*
判断功能的方法
public boolean exists() ：此File表示的文件或目录是否实际存在。
public boolean isDirectory() ：此File表示的是否为目录。
public boolean isFile() ：此File表示的是否为文件。
 */
public class Demo04File {
    public static void main(String[] args) {
        show02();
    }
/*
public boolean isDirectory() ：此File表示的是否为目录。
        用于判断构造方法中给定的路径是不是以文件夹结尾
        是：true
        不是：false
public boolean isFile() ：此File表示的是否为文件。
用于判断构造方法中给定的路径是不是以文件结尾
        是：true
        不是：false

  注意：
   电脑的硬盘中只有文件和文件夹，两个方法是互斥的
   这两个方法的使用前提是，路径必须存在，否则都返回false
 */
    private static void show02() {
        File f1 = new File("D:\\ideaproject\\jinji");//路径不存在
        if(f1.exists()){//路径不存在就没有必要获取
            System.out.println(f1.isDirectory());//false
            System.out.println(f1.isFile());//false
        }


        File f2 = new File("D:\\ideaproject\\jinjie");
        if(f2.exists()){
            System.out.println(f2.isDirectory());//true
            System.out.println(f2.isFile());//false
        }


    }

    /*
    public boolean exists() ：此File表示的文件或目录是否实际存在。
    用于判断构造方法中的路径是否存在
    存在true
    不存在false
     */
    private static void show01() {
        File f1 = new File("D:\\ideaproject\\jinjie");
        System.out.println(f1.exists());//true

        File f2 = new File("D:\\ideaproject\\jinji");
        System.out.println(f2.exists());//false
    }
}
