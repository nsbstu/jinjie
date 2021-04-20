package cn.itcast.demo02Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
java.until.set  extends Collection
特点：
1：不允许有重复的元素
2：没有索引，没有带索引的方法，也不能使用for循环

java.until,hashset implements set

特点：
    1 ：不允许存储重复的元素
   2：没有索引，没有带索引的方法，也不能使用for循环
   3:是一个无序的集合，存储元素和取出元素的顺序有可能不一致
   4：底层是一个哈希表结构（查询速度快）
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用ADD添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //不能使用for遍历，只能用迭代器
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            System.out.println(n);

        }

        System.out.println("===========");

        //增强for遍历
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
