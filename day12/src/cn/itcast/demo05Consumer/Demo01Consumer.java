package cn.itcast.demo05Consumer;

import java.util.function.Consumer;

/*
    java.util.function.Consumer<T> 接口则正好与Supplier接口相反
   它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。

    consumer 接口中包含抽象方法 void accept(T t) ，
    意为消费一个指定泛型的数据。

 */
public class Demo01Consumer {
    //定义一个方法，返回值为空，第一个参数是人名，另一个参数是Consumer接口
    //可以使用accept消费姓名（使用姓名）
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        //使用匿名内部类
        method("李黑", new Consumer<String>() {
            @Override
            public void accept(String name) {
               String reName =  new StringBuffer(name).reverse().toString();
                System.out.println(reName);
            }
        });

//====================================================================================================
        //调用method方法，传递的参数是一个函数式接口，可以调用lambda表达式
        method("李白",(name)->{
            //消费1：打印输出name
           // System.out.println(name);

            //消费2：反转
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
           /* char[] chars = name.toCharArray();
            for (int i = chars.length -1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
            chars.toString();*/
        });
    }
}
