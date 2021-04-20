package cn.itcast.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型
 */
public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }
    /*
    创建集合对象，使用泛型
    好处：1避免类型转化的麻烦，存储是什么类型，取出的是什么类型
        2：把运行异常（代码运行之后会抛出异常），提升到了编译期（写代码时候报错）
    弊端：泛型是什么类型只能存储什么类型的数据

     */

    private static void show02() {

        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        //list.add(1);

        //使用迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s.length());
        }
    }

    /*
    创建集合不适用泛型
    好处：默认是object类型，可以存储任意类型数据
    弊端：不安全会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        //使用迭代器遍历
        Iterator it = list.iterator();
       while(it.hasNext()){
            Object obj = it.next();
           System.out.println(obj);

           //想要使用string类特有的方法，length获取字符串长度；
           //不能使用  多态 object obj =  “abc”
           //需要向下转型
           //ClassCastException类型转换异常，不能把Interger转换
           String s =(String) obj;
           System.out.println(s.length());//ClassCastException
        }
    }
}
