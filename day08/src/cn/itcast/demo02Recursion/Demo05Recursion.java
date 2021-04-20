package cn.itcast.demo02Recursion;

import java.io.File;
import java.util.Locale;

/*
递归打印多级目录
分析：多级目录的打印，就是当目录的嵌套。
遍历之前，无从知道到底有多少级目录，所以我们还是要使用递归实现。

只有。java文件
 */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("D:\\ideaproject\\jinjie\\day08");
        getAllFile(file);
    }

    public static void getAllFile(File dir){

        File[] files = dir.listFiles();
        for (File f : files) {
            //如果f是一个文件夹，就会继续遍历这个文件夹

            if(f.isDirectory()){
                getAllFile(f);
            }else{
                /*
                只要。java文件
                1.把file对象转换为String对象
                 */

                /* String name = f.getName();
                String path = f.getPath();*/

               // String s = f.toString();

                //把字符串转换为小写再判断
                //s = s.toLowerCase();

                //调用String的endsWith判断字符串是否以。java结尾
              //  if(s.endsWith(".txt")){
                  //  System.out.println(f);
              //  }
                //链式
                if(f.toString().toLowerCase().endsWith(".txt")){
                    System.out.println(f);
                }

            }

        }
    }
}
