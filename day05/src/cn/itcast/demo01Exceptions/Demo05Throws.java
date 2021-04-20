package cn.itcast.demo01Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
throws关键字：异常处理的第一种方法，交给别人处理
作用：
     当方法的内部抛出异常的时候，那么我们就必须处理这个异常对象
     可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理（自己不处理，给别人处理），
     最终交给jvm处理---》中断处理
     使用格式：在方法声明时使用
     修饰符 返回值类型 方法名（参数列表） throws AAAException。。。{
     throw new AAAException（”产生原因“）；
     throw new BBBException（”产生原因“）；

     }
     注意：
      1：throws关键字必须写在方法声明处。
      2：throws后边生命的异常必须是Exception或者EXCEPTION子类
      3：方法内部如果抛出多个异常对象，那么throws后边必须声明多个异常
         如果抛出的异常对象有子父类关系，那么必须声明父类即可
       4：调用一个声明抛出异常的方法，我们就必须处理声明的异常
         要么继续使用throws，声明抛出，交给方法的处理者处理，最终交给jvm
         要么使用try。。catch自己处理异常

 */
public class Demo05Throws {

    /*
    FileNotFoundException extends IOException extends Exception
   如果抛出的异常对象有子父类关系，那么直接声明父类即可都是 Exception
     */
    public static void main(String[] args) throws IOException {
        readFile("e:\\a.tx");
    }
    /*
    定义一个方法，对传递进来的文件路经进行判断
    如果路径不是”c:\\a.txt“，那么我们就抛出文件找不到异常对象，告知方法的调用者
注意：

     */
    public static void readFile(String fileName) throws IOException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是");
        }

        /*
        如果传递的不是txt文件
        那么我们就抛出异常io异常对象，告知方法的调用者文件的后缀不对

         */
        if(!fileName.endsWith(".txt")){
            throw  new IOException("文件后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
