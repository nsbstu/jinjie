package cn.itcaast.demo01OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，
        从偏移量 off开始输出到此输出流。
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
// 1：创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("day09\\b.txt"));

//     2：调用FileOutputStream对象中的方法write，把数据写入到文件中
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
         public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
         一次书写多个字节
           如果写的第一个字节是正数（1-127），那么显示的时候会查询ascll表
           如果写的第一个字节是负数，那么第一个字节和第二个字节，两个字节会组成一个中文显示，查询系统默认码表（gbk）

         */

        byte[] bytes = {65, 66, 67, 68, 69};//ABCDE
        //   byte[] bytes = {-65,-66,-67,68,69};//烤紻E
        fos.write(bytes);

        /*
         public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
              int off:数组的开始索引
              int len : 写几个字节
         */
        fos.write(bytes,1,2);//BC


        /*
        写入字符串的方法：可以使用String类的方法把字符串转换为字节数组
        byte[] getBytes()  把字符串转换为字节数组
         */
        byte[] bytes2 = "你好".getBytes();
        //gbk中两个字节一个中文，utf-8中三个字节是一个中文
        System.out.println(Arrays.toString(bytes2));//[-28, -67, -96, -27, -91, -67]
        fos.write(bytes2);
//     3：释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）
        fos.close();
    }
}
