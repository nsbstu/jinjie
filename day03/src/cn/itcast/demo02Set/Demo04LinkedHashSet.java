package cn.itcast.demo02Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
java.until.set.LinkedHshSet extends hashset
特点：
    底层是哈希表（数组+链表/红黑树）加链表，多了一条链表（记录元素的存储顺序，保证元素有序）
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);//[abc, www, itcast]无序不重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked);

    }
}
