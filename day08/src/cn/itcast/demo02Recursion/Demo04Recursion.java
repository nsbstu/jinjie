package cn.itcast.demo02Recursion;

import java.io.File;

/*
分析：多级目录的打印，就是当目录的嵌套。
遍历之前，无从知道到底有多少级目录，所以我们还是要使用递归实现。

 */
public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\ideaproject\\jinjie\\day08");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            //如果f是一个文件夹，就会继续遍历这个文件夹

            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }

        }
    }
}
