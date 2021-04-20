package cn.itcast.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符
？：任意的数据类型
使用方法：
不能创建对象使用，只能作为方法的参数使用

 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

        //ArrayList<?> list03 = new ArrayList<>();创建对象时不能使用？
    }
/*
定义一个方法，能遍历所有的类型的Arraylist集合
不知道是什么类型，使用？来接收
泛型没有继承概念
 */
public static  void printArray(ArrayList<?> list){
    //使用迭代器遍历
    Iterator<?> it = list.iterator();
    while (it.hasNext()){
        //it.next方法取出的是object，可以接收任意的数据类型
        Object o = it.next();
        System.out.println(o);
    }

}

}
