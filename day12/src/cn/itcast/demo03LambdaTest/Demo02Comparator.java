package cn.itcast.demo03LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/*
    ，如果一个方法的返回值类型是一个函数式接口，
    那么就可以直接返回一个Lambda表达式。
    当需要通过一个方法来获取一个 java.util.Comparator 接口类型的对象作为排序器时,m
    就可以调该方法获取。
 */
public class Demo02Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        //方法的返回值是一个接口，那么我们可以返回这个接口的匿名内部类
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };*/

        //方法的返回值是一个函数式接口，那么我们可以返回这个接口的lambda表达式
       /* return (String o1, String o2) ->{
                return o2.length() - o1.length();
        };*/

        //优化lambda
        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        //定义一个字符串数组
        String[] arr = {"aaa","b","cccccc","d"};
        //输出排序前的数组
        //static String toString(Object[] a)返回指定数组内容的字符串表示形式。

        System.out.println(Arrays.toString(arr));//[aaa, b, cccccc, d]
        //调用Arrays的sort方法，对字符串数组进行排序
        //static <T> void sort(T[] a, Comparator<? super T> c)根据指定比较器产生的顺序对指定对象数组进行排序。
        Arrays.sort(arr,getComparator());
        //输出排序后的数组
        System.out.println(Arrays.toString(arr));//[cccccc, aaa, b, d]

    }
}
