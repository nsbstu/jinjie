package cn.itcast.demo02Iterator;

import java.util.ArrayList;

/*
简化了Iterator
所有的单列集合都可以使用foreach
public interface Iterable<T>
实现这个接口允许对象成为 "foreach" 语句的目标。
格式
for(集合数组的数据类型 变量名 ： 集合名/数组名)
sout（变量名）
 */
public class Demo01Foreach {
    public static void main(String[] args) {
        demo02();

    }
    //使用增强for遍历
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s: list){
            System.out.println(s);
        }
     }

    //使用增强for遍历
    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
