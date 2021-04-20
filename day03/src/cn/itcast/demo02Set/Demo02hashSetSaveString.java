package cn.itcast.demo02Set;

import java.util.HashSet;

/*
set不允许存储重复元素的原理
 */
public class Demo02hashSetSaveString {
    public static void main(String[] args) {
        //创建hashset集合
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
