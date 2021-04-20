package cn.itcast.demo01Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo02Stream {
    public static void main(String[] args) {
        //创建一个list集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        //对list集合中的元素进行过滤，只要以张开头的元素存储到一个新的集合中
        //对listA中的元素进行过滤，只要姓名长度为3的人，存储到一个新的集合中
        //遍历输出listB
        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}
