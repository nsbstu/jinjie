package cn.itcast.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
 * `public void clear()` :清空集合中所有的元素。
 * `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
 * `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
 * `public boolean isEmpty()`: 判断当前集合是否为空。
 * `public int size()`: 返回集合中元素的个数。
 * `public Object[] toArray()`: 把集合中的元素，存储到数组中。

 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了tostring方法
        /*
        `public boolean add(E e)`：  把给定的对象添加到当前集合中
         */
        boolean b1 = coll.add("张三");
        System.out.println("b1" + b1);//b1true
        System.out.println(coll);//[张三]
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);//[张三, 李四, 王五, 赵六, 田七]

   /*
   public boolean remove(E e)`: 把给定的对象在当前集合中删除。
    */
        boolean b2 = coll.remove("赵六");
        System.out.println("b2:" + b2);//true
        boolean b3 = coll.remove("赵四");
        System.out.println("b3:" + b3 );//false
        System.out.println(coll);//[张三, 李四, 王五, 田七]

     //   public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
        boolean b4 = coll.contains("李四");
        System.out.println("b4:" + b4);
        boolean b5 = coll.contains("张四");
        System.out.println("b5:" + b5);
        System.out.println(coll);

        //public boolean isEmpty()`: 判断当前集合是否为空。
        boolean b6 = coll.isEmpty();
        System.out.println("b6:" + b6);

        //public int size()`: 返回集合中元素的个数。
        int size = coll.size();
        System.out.println("size: " + size);

        //public Object[] toArray()`: 把集合中的元素，存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //public void clear()` :清空集合中所有的元素。不删除集合
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}
