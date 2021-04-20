package cn.itcast.demo02Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
try..catch:异常处理的第二种方法，自己处理异常
 格式：
 try{
    编写可能会出现异常的代码
}catch(异常类型 e){
处理异常的代码
//记录日志/打印异常信息/继续抛出异常
}
。。。
catch(异常类型 e){
处理异常的代码
//记录日志/打印异常信息/继续抛出异常
}
注意：
1：try中可能抛出多个异常对象 ，就可以使用多个catch处理这些异常对象\
2:如果try中产生了异常，那么就执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try。。catch之后的代码
 如果try中没有产生异常，就不会执行catch，执行完try，就继续执行try。。catch之后的代码
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try{
            readFile("d:\\a.tx");
            System.out.println("资源释放");
        }catch (IOException e){
            //try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
           // System.out.println("catch- 传递的文件后缀不是txt");
            /*
            Throwable类中定义了三个异常处理的方法
            public String getMessage() :返回此throwable的简短描述
            public String toString() :返回此throwable的详细消息字符串
            public void printStackTrace() :jvm打印异常对象，默认此方法，异常信息是最全面的

             */
         // System.out.println(e.getMessage());//文件后缀名不对
           // System.out.println(e.toString());//java.io.IOException: 文件后缀名不对
           // System.out.println(e);//java.io.IOException: 文件后缀名不对
          e.printStackTrace();//最全面的
          /*
          java.io.IOException: 文件后缀名不对
	at      cn.itcast.demo02Exception.Demo01TryCatch.readFile(Demo01TryCatch.java:55)
	at      cn.itcast.demo02Exception.Demo01TryCatch.main(Demo01TryCatch.java:28)
后续代码
           */
        }
        System.out.println("后续代码");
    }
    /*
        如果传递的不是txt文件
        那么我们就抛出异常io异常对象，告知方法的调用者文件的后缀不对

         */
    public static void readFile(String fileName) throws IOException {


        if(!fileName.endsWith(".txt")){
            throw  new IOException("文件后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
