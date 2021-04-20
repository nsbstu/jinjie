package cn.itcaast.demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组 b中。
  明确两件事：
    1：方法的参数byte【】的作用？
    起到缓冲的作用，存储每次读取的多个字节
    数组的长度一般定义为1024（1kb)或者1024的整数倍

    2：方法返回值int是什么？
    每次读取到的有效字节个数

String(byte[] bytes) :把字节数组转换为字符串
 String(byte[] bytes, int offset, int length) ：把字节数组一部分转换为字符串
 int offset：转换的起始索引
  int length ：转换的个数
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        // 1：创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("day09\\b.txt");
        // 2：使用FileInputStream对象的方法read，读取文件
        //int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组 b中。
       /* byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);//2
       // System.out.println(Arrays.toString(bytes));//[65, 66]
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);//2每次读取的字符串的个数
        System.out.println(new String(bytes));//CD

        len = fis.read(bytes);
        System.out.println(len);//1每次读取的字符串的个数
        System.out.println(new String(bytes));//ED

        len = fis.read(bytes);
        System.out.println(len);//-1每次读取的字符串的个数
        System.out.println(new String(bytes));//ED*/

        /*
        循环优化
        发现以上读取的文件是一个重复的过程，所以可以使用循环优化
        不知道文件中的字节，使用while循环
        while循环结束条件，读取到-1的时候结束

         */
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            //String(byte[] bytes, int offset, int length) ：把字节数组一部分转换为字符串
            System.out.println(new String(bytes,0,len));
        }

        //  3:释放资源
        fis.close();
    }
}
