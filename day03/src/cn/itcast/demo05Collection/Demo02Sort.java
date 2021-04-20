package cn.itcast.demo05Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 `public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。

 注意：sort(List<T> list)使用前提
        被排序的集合里边存储的元素必须实现comparable，重写接口中的comparaTo定义排序的规则

  comparable排序的规则：
 自己（this）- 参数（o）：升序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,3,2);
        System.out.println(list01);
        //sort
        Collections.sort(list01);
        System.out.println(list01);


        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02,"a","c","b");
        System.out.println(list02);
        //sort
        Collections.sort(list02);
        System.out.println(list02);


        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三",18));
        list03.add(new Person("李四",20));
        list03.add(new Person("王五",19));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);
    }
}
