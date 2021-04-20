package cn.itcast.demo05Consumer;

import java.util.Locale;
import java.util.function.Consumer;

/*
    consumer接口的默认方法andthen
    作用：需要将两个consumer接口，可以把两个接口连接组合在一起，再对数据消费

    例如：
    Consumer<String> con1;
    Consumer<String> con2;
    String s = "hello"
    con1.accept(s);
    con2.accept(s);
    连接两个consumer接口，在进行消费
    con1.andThen(con2).accept(s); 谁在前边谁先消费

 */
public class Demo02AndThen {
    //定义一个方法，方法的参数传递一个字符串和两个consumer接口，consumer接口的泛型使用字符串
    public static void method(String name, Consumer<String> con1,Consumer<String> con2){
        /*con1.accept(name);
        con2.accept(name);*/
        //使用andthen连接两个接口
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
    //调用method方法，传递两个函数式接口，可以使用lanmbda
        method("hello",
        (t)->{
            System.out.println(t.toUpperCase());
        },
         (t)->{
             System.out.println(t.toLowerCase());
         });
    }
}