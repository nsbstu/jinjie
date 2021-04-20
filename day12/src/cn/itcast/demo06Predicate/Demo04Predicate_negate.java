package cn.itcast.demo06Predicate;

import java.util.function.Predicate;

/*
    需求：判断一个字符串，判断字符串的长度>5;
    如果字符串的长度》5，返回false
    如果不满足条件返回true
    所以我们可以使用取反符号！对判断结果进行取反
    接口中有一个方法negate，也表示取反
    default Predicate<T> negate() {
        return (t) ‐> !test(t);
    }

 */
public class Demo04Predicate_negate {
    /*
    定义一个方法，方法的参数，传递一个字符串
    传递predicate接口用于判断字符串的长度是否大于5
     */
    public static boolean checkString(String s, Predicate<String> pre){
       // return !pre.test(s);
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s ="ab";
        //调用checkString方法，参数传递的是一个函数式接口，使用lambda
        boolean b = checkString(s, (String str) -> {
            //对参数传递的字符串进行判断，判断字符串的长度是否大于5，并把判断的结果返回
            return str.length() > 5;
        });
        System.out.println(b);
    }
}
