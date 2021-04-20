package cn.itcast.demo01Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.lang.Throwable:类是java语言中所有错误或异常的超类
  Exception:编译期异常，进行编码java程序出现的问题
    RuntimeException:运行期异常，java程序运行过程中出现的问题
    异常相当于程序的小毛病，把异常处理掉，程序可以继续执行
   Error：错误
            就相当于程序得了一个无法治愈的毛病，必须修改代码，程序才能执行
 */
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        //  Exception:编译期异常，进行编码java程序出现的问题
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");//格式化日期
        Date date = null;//把字符串格式的日期，解析为Date格式的日期
        try {
            date = sdf.parse("1999-0909");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        //RuntimeException:运行期异常，java程序运行过程中出现的问题

       /* int[] array = {1,2,3};
       // System.out.println(array[0]);
        try{
            //可能会出县异常的代码
            System.out.println(array[3]);
        }catch(Exception e){
            //异常的处理逻辑
            System.out.println(e);

        }*/


        //   Error：错误
        /*
        OutOfMemoryError  Java heap space
        内存溢出的错误，创建的数组太大了，超出了jvm分配的内存
         */
        int[] arr = new int[1024 * 1024];
//必须修改代码，创建的数组小一点

        System.out.println("后续代码");
    }
}
