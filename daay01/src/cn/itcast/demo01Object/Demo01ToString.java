package cn.itcast.demo01Object;

import cn.itcast.demo01Collection.Person;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
toString默认了Object类
 */
public class Demo01ToString {
    public static void main(String[] args) {
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);//cn.itcast.demo01.Person@7ef20235
    //直接打印对象的名字，就是调用对象的toString方法，p = p.toString
        System.out.println(p);//cn.itcast.demo01.Person@7ef20235
        //看一个类是否重写了toString方法，直接打印创建对象的名字即可
        //没有重写toStirng方法，就会打印的对象的地址值
        Random r = new Random();//没有重写toString方法
        System.out.println(r);//java.util.Random@52cc8049

        Scanner sc = new Scanner(System.in);//重写了toString
        System.out.println(sc);//java.util.Scanner[delimiters=\p{javaWhitespace}

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);//重写了toString
        System.out.println(list);//[1, 2]
     }
}
