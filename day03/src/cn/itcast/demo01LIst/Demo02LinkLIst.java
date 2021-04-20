package cn.itcast.demo01LIst;

import java.util.LinkedList;

/*
implements list接口

特点：1：底层是链表，查询慢，增删快
    2   ：包含大量的操作首尾元素的方法
    注意：使用他的特有方法不能使用多态
public void addFirst(E e)`:将指定元素插入此列表的开头。
public void addLast(E e)`:将指定元素添加到此列表的结尾。
public void push(E e)`:将元素推入此列表所表示的堆栈。


public E getFirst()`:返回此列表的第一个元素。
public E getLast()`:返回此列表的最后一个元素


public E removeFirst()`:移除并返回此列表的第一个元素。
public E removeLast()`:移除并返回此列表的最后一个元素。
public E pop()`:从此列表所表示的堆栈处弹出一个元素。

public boolean isEmpty()`：如果列表不包含元素，则返回true。

 */
public class Demo02LinkLIst {
    public static void main(String[] args) {
        show03();
    }
/*
public E removeFirst()`:移除并返回此列表的第一个元素。
public E removeLast()`:移除并返回此列表的最后一个元素。
public E pop()`:从此列表所表示的堆栈处弹出一个元素。==removeFirst
 */
    private static void show03() {
        //使用LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
       /* String first = linked.removeFirst();
        System.out.println(f);*/
        String first = linked.pop();
        System.out.println(first);

        String last = linked.removeLast();
        System.out.println(last);
        System.out.println(linked);
    }

    /* public E getFirst()`:返回此列表的第一个元素。
     public E getLast()`:返回此列表的最后一个元素*/
    private static void show02() {
        //使用LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.clear();//清空集合的元素NoSuchElementException
        if(!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }

    }

    /*
    public void addFirst(E e)`:将指定元素插入此列表的开头。
    public void addLast(E e)`:将指定元素添加到此列表的结尾。==add
    public void push(E e)`:将元素推入此列表所表示的堆栈。==addFirst
     */
    private static void show01() {
        //使用LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
/*
        linked.addFirst("www");
        System.out.println(linked);*/

        linked.push("www");
        System.out.println(linked);

        linked.addLast("com");
        System.out.println(linked);
    }
}
