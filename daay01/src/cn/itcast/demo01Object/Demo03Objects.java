package cn.itcast.demo01Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";

        //String s1 = null;
        String s2 = "abc";
        // boolean b = s1.equals(s2);//NullPointerException null 不能调用方法
        //System.out.println(b);
/*
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
 */
        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);

    }
}
