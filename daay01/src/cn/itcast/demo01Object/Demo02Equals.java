package cn.itcast.demo01Object;

import cn.itcast.demo01Collection.Person;

import java.util.ArrayList;

/*
toString默认继承了Object类
boolean equals(Object obj){
    return(this == obj);}
    参数返回的是true或者false
    基本类型：比较的是值
    引用数据类型：两个对象的地址值
this:哪个对象调用的this，方法中的this就是那个对象

 */
public class Demo02Equals {
    public static void main(String[] args) {
    Person p1 = new Person("迪丽热巴",18);
    //Person  p2 = new Person("古力娜扎",19);
    Person  p2 = new Person("迪丽热巴",18);
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);

        //p1 = p2;//把p2的地址值赋值给p1

        ArrayList<Integer> list = new ArrayList<>();


        boolean b = p1.equals(list);
        //ClassCastException类型转换异常，
        // 需要在重写equals时候，向下转型时候判断一下
        System.out.println(b);
    }
}
