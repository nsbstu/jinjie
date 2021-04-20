package cn.itcast.demo02Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream中的常用方法 count：用于统计Stream流中元素的个数
    long count();
    count方法是一个终结方法，返回值是一个long类型的数据
    所以不能继续调用Stream中其他方法

 */
public class Demo05Stream_count {
    public static void main(String[] args) {
        //获取一个Stream流
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }

}
