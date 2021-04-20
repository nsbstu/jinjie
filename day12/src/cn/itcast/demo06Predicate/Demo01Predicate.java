package cn.itcast.demo06Predicate;

import java.util.function.Predicate;

/*
    有时候我们需要对某种类型的数据进行判断，从而得到一个boolean值结果。
    这时可以使用java.util.function.Predicate<T> 接口。

    Predicate 接口中包含一个抽象方法：
        boolean test(T t) 。用于条件判断的场景：
            结果：
            符合条件返回true
            不符合条件，返回false


 */
public class Demo01Predicate {
    /*
    定义一个方法
    参数传递一个String的字符串
    传递一个Predicate接口，泛型使用String
    使用接口的抽象方法test对字符串进行判断，并把判断的结果返回
    */
    public static boolean checkString(String s, Predicate<String> pre ){
        return pre.test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s ="abcdesds";
        //调用checkString方法，参数传递的是一个函数式接口，使用lambda
        /*boolean b = checkString(s, (String str) -> {
            //对参数传递的字符串进行判断，判断字符串的长度是否大于5，并把判断的结果返回
            return str.length() > 5;
        });
        System.out.println(b);*/
        //优化lambda
        boolean b = checkString(s, str -> str.length() > 5);
        System.out.println(b);

    }
}
