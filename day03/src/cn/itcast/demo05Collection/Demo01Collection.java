package cn.itcast.demo05Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
public static <T> boolean addAll(Collection<T> c, T... elements) :往集合中添加一些元素。
public static void shuffle(List<?> list) 打乱顺序`:打乱集合顺序。

 */
public class Demo01Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //addALL
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);

        //shuffle
        Collections.shuffle(list);
        System.out.println(list);
    }
}
