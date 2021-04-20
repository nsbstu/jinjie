package cn.itcast.demo02Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
finally代码块
try{
    编写可能会出现异常的代码
}catch(异常类型 e){
处理异常的代码
//记录日志/打印异常信息/继续抛出异常
}finally{
无论是否出现异常都会执行
}
注意：
1：finally不能单独使用，必须和try一起使用
2：一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放

 */
public class Demo02Finally {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //无论是否出现异常都会执行
            System.out.println("资源释放");
        }
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
