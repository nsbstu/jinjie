package cn.itcast.demo02Stream;

import java.util.stream.Stream;

/*
    Stream中的常用方法 foreach
    void forEach(Consumer<? super T> action)
    该方法接收一个 Consumer 接口函数，会将每一个流元素交给该函数进行处理。


    java.util.function.Consumer<T>接口是一个消费型接口。
    Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。

    Consumer是一个消费型的函数式接口，可以传递lambda表达式，消费数据
     简单记：
        forEach方法，用来遍历流中的数据
        是一个终结方法，遍历之后就不能继续调用Stream流中的其他方法

 */
public class Demo02Stream_forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
        //使用Stream中的方法forEach对流中的数据进行遍历
        /*stream.forEach((String name)->{
            System.out.println(name);
        });
        */
        //优化
        stream.forEach(name -> System.out.println(name));
    }
}
