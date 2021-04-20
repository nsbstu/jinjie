package cn.itcast.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
public E next()`:返回迭代的下一个元素。
* `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。
Interator是接口，无法直接使用，使用时候需要使用他的实现类
使用iterator方法返回迭代器的实现类对象
Iterator《E》iterator返回迭代的迭代器

适应步骤
1：使用iterator方法获取迭代器的实现类对象，使用Iterator接口来接收
2：使用hashnext判断有没有下哟i个
3使用next取出下一个
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //添加元素
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");

        //1.获取迭代器，迭代器的泛型等于集合泛型
        //多态  接口    实现类对象
        Iterator<String> it = coll.iterator();

        /*
        发现使用迭代器取出的集合中的元素的代码相同，所以使用循环优化
        不知道集合中元素个数，使用while

         */

        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("===================");
        for(Iterator<String> it2 = coll.iterator();it2.hasNext(); ){
            String e = it2.next();
            System.out.println(2);
        }



/*
        //使用hashnext判断有没有下yi个
        boolean b = it.hasNext();
        System.out.println(b);

        //3使用next取出下一个
        String s = it.next();
        System.out.println(s);

        //使用hashnext判断有没有下哟i个
       b = it.hasNext();
        System.out.println(b);

        //3使用next取出下一个
       s = it.next();
        System.out.println(s);


        //使用hashnext判断有没有下哟i个
        b = it.hasNext();
        System.out.println(b);

        //3使用next取出下一个
     s = it.next();
        System.out.println(s);


        //使用hashnext判断有没有下哟i个
        b = it.hasNext();
        System.out.println(b);

        //3使用next取出下一个
       s = it.next();
        System.out.println(s);*/
    }
}
