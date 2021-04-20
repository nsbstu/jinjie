package cn.itcast.demo05Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
`public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序。

comparable和comparator的区别
comparable：自己（this）和别人（参数）的比较，自己实现comparable接口，重写comparaTo方法
comparator：相当于一个第三方的裁判，比较两个

comparator排序规则：
  o1-o2//升序
 */
public class Demo03sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1, 3, 2);
        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                // return o1 - o2;//升序
                return o2 - o1;//降序
            }
        });
        System.out.println(list01);


        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a迪丽热巴", 20));
        list02.add(new Student("古力娜扎", 18));
        list02.add(new Student("杨幂", 17));
        list02.add(new Student("b杨幂", 18));
        System.out.println(list02);
       /* Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序
                return o1.getAge() - o2.getAge();
            }
        });*/

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序
                int result = o1.getAge() - o2.getAge();
                //如果年龄相同，再使用姓名的第一个字比较
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return  result;
            }
        });
        System.out.println(list02);
    }
}
