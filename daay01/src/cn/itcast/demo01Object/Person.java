package cn.itcast.demo01Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    直接打印对象的地址值没有意义，重写object的toString
    打印属性（name，age）

     */

    /*@Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/


    /*
    object中的equals方法，默认比较的是两个对象的地址值，没有意义
    我们要重写equals比较两个对象的属性值
    问题：
    隐含一个多态
    多态的弊端：无法使用子类特有的内容（属性和方法）
    解决：向下转型（强转）
     */

   /* @Override
    public boolean equals(Object obj) {
        //增加，如果传入的是this本身直接返回true
        if(obj == this){
            return true;
        }

        //如果传入的是null直接返回false
        if(obj == null){
            return false;
        }

        //防止转换异常需要判断
        if(obj instanceof Person){
            //向下转型
            Person p = (Person) obj;
            //比较两个对象的属性，一个是this（p1），一个是p（obj-》p2）
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return  b;
        }
        return false;//不是Person类型直接返回false


    }*/



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass()使用反射技术判断o是不是Person
        //等效于if(obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

