package cn.itcast.demo03ReverseStream;

import java.io.*;

/*
练习：转换文件编码
    将gbk编码的文件文本，转换为utf-8编码的文本文件

 分析：
     1：创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
     2：创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
     3：使用InputStreamReader对象中的方法read读取文件
     4：创建OutputStreamWriter对象的方法write，把读取的数据写入到文件中
     5:释放资源

 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        //1：创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\我的GBK文档.txt"),"gbk");

        //2：创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10\\我的utf-8文档.txt"),"utf-8");
        //3：使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while((len = isr.read()) != -1){
            //4：创建OutputStreamWriter对象的方法write，把读取的数据写入到文件中
            osw.write(len);
        }

        //5:释放资源
        osw.close();
        isr.close();
    }
}
