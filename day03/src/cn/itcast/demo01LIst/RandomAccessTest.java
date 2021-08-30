package cn.itcast.demo01LIst;
/*
如果 List 子类实现了 RandomAcce ss 接口，那表示它能快速随机访问存储的元素，
这时候你想到的可能是数组， 通过下标 index 访问， 实现了该接口的 ArrayList 底层实现就是数组，
同样是通过下标访问， 只是我们需要用 get() 方法的形式 ， ArrayList 底层仍然是数组的访问形式。
同时你应该想到链表， LinkedList 底层实现是链表， LinkedList 没有实现 RandomAccess 接口，
发现这一点就是突破问题的关键点。数组支持随机访问， 查询速度快， 增删元素慢；
链表支持顺序访问， 查询速度慢， 增删元素快。
所以对应的 ArrayList 查询速度快，LinkedList 查询速度慢，
 RandomAccess 这个标记接口就是标记能够随机访问元素的集合， 简单来说就是底层是数组实现的集合。

 */
import java.util.*;

public class RandomAccessTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        traverse(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("c");
        linkedList.add("d");
        traverse(linkedList);
    }
    public static void traverse(List list){

        if (list instanceof RandomAccess){
            System.out.println("实现了RandomAccess接口，不使用迭代器");

            for (int i = 0;i < list.size();i++){
                System.out.println(list.get(i));
            }

        }else{
            System.out.println("没实现RandomAccess接口，使用迭代器");

            Iterator it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

        }
    }

}
