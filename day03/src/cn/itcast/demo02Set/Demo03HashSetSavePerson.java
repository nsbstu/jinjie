package cn.itcast.demo02Set;

import java.util.HashSet;

/*
hashset存储自定义类型的元素
set集合报错元素唯一：
    存储元素：（String,Integer,...Student,person),
            必须重写hashCode和equals方法
     要求：
        同名同年龄的人，视为同一个人，只存储一次

 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
    //创建hashset集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女",18);
        Person p2 = new Person("小美女",18);
        Person p3 = new Person("小美女",19);
        System.out.println(p1.hashCode());//2129789493
        System.out.println(p2.hashCode());//668386784
        System.out.println(p1 == p2);//false比较对象
        System.out.println(p1.equals(p2));//false
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
