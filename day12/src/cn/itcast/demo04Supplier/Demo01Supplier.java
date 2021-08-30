package cn.itcast.demo04Supplier;

import java.util.function.Supplier;

/*
    常用的函数式接口
    java.until.function。Supplier<T>接口仅包含一个无参方法：T get(),用来获取一个泛型参数指定类型的对象数据

    Supplier<T> 接口被称之为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据


 */
public class Demo01Supplier {
    //创建一个方法，方法的参数传递Supplier《T》接口，泛型执行String。get方法就会返回一个String类型
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //调用getString方法，方法的参数是一个函数式接口，所以传递匿名内部类
        String s = getString(new Supplier<String>() {
            @Override
            public String get() {
                //生产一个字符串并返回
                return "胡歌";
            }
        });
        System.out.println(s);
        //调用getString方法，方法的参数是一个函数式接口，所以lambda
        String s1 = getString(()-> {
                return "胡歌";

        });
        System.out.println(s1);
        //优化lambda
        String s2 = getString(()-> "胡歌");
        System.out.println(s2);
    }
}
