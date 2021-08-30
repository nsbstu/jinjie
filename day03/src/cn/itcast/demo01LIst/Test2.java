package cn.itcast.demo01LIst;


import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
public class Test2 {
    public static void main(String[] args) {
        List l =new  ArrayList();
        l.add(0,"a");
        l.add(0,"b");
        l.add(2,"c");
        l.add(3,"d");
        System.out.println(l);
        ListIterator li = l.listIterator();
        while (li.hasNext()) {
            Object n = li.next();
            if (n.equals("b")) {
                li.add("ee");//使用迭代器进行删除,不能使用集合对象
            }
            //System.out.println(n);
        }
        System.out.println(l);
    }
}
