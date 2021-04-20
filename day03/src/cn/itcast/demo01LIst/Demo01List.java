package cn.itcast.demo01LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
list extends collection
特点
1：有序
2.有索引
3：允许存储重复的

`public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
- `public E get(int index)`:返回集合中指定位置的元素。
- `public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
- `public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。


 */
public class Demo01List {
    public static void main(String[] args) {
        //创建对象,多态
        List<String> list = new ArrayList<>();
        //add方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);


        //public void add(int index, E element)`:
        // 将指定的元素，添加到该集合中的指定位置上。
        list.add(3,"itheima");
        System.out.println(list);

        //public E remove(int index)`: 移除列表中指定位置的元素,
        // 返回的是被移除的元素。
        String removeE = list.remove(2);
        System.out.println(removeE);

        //public E set(int index, E element)`:
        // 用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        String setE = list.set(3, "D");
        System.out.println(setE);
        System.out.println(list);

        //`public E get(int index)`:返回集合中指定位置的元素。
        //list的三种遍历
        //普通遍历
        for(int i = 0; i < list.size();i++){
            //get方法
            String s = list.get(i);
            System.out.println(s);
        }
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        
        //增强for
        for (String s : list) {
            System.out.println(s);
        }

    }
}
