package cn.itcast.demo02Stream;

import java.util.stream.Stream;

/*
    如果希望跳过前几个元素，可以使用 skip 方法获取一个截取之后的新流：
    Stream<T> skip(long n);
    如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
 */
public class Demo07Stream_skip {
    public static void main(String[] args) {
        //获取一个流
        String[] arr = {"喜羊羊", "美羊羊", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        //使用skip方法跳过前三个元素
        Stream<String> stream2 = stream.skip(3);
        //遍历身体ream
        stream2.forEach(name -> System.out.println(name));
    }
}
