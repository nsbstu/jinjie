package cn.itcast.demo03Filter;

import java.io.File;

/*
递归打印多级目录
分析：多级目录的打印，就是当目录的嵌套。
遍历之前，无从知道到底有多少级目录，所以我们还是要使用递归实现。

只有。java文件
使用过滤器来实现

  file中有两个和listfiles重载的方法，方法的参数传递的是过滤器
 File[] listFiles(FileFilter filter)返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
    java.io.FileFilter接口：用于抽象路径名（file对象）的过滤器
    作用：用来过滤文件（file对象）
        抽象方法：用来过滤文件的方法
        boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
            参数:File pathname:使用listfiles方法遍历目录，得到的每一个文件对象

 File[] listFiles(FilenameFilter filter)返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名。
    作用：用来过滤文件（file对象）
        抽象方法：用来过滤文件的方法
          boolean accept(File dir, String name)  测试指定文件是否应该包含在某一文件列表中。
                参数：
                    File dir：构造方法中传递的被遍历的目录
                    String name：使用listfiles方法遍历目录，获取的每一个文件/文件夹的名称
 注意：
    两个过滤器是没有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则


 */
public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("E:\\ideaproject\\jinjie\\day08");
        getAllFile(file);
    }

    public static void getAllFile(File dir){

        File[] files = dir.listFiles(new FileFilterImpl());//传递过滤器对象
        for (File f : files) {
            //如果f是一个文件夹，就会继续遍历这个文件夹

            if(f.isDirectory()){
                getAllFile(f);
            }else{
                //f是一个文件直接打印即可
                System.out.println(f);

            }

        }
    }
}
