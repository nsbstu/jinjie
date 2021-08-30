package cn.itcast.demo01Object;

import org.w3c.dom.ls.LSOutput;

public class DemoTestToString {
    public static void main(String[] args) {
        Person p = new Person("niniuniu",22);
        System.out.println(p);
        System.out.println(p.toString());
    }


}
