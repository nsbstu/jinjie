package cn.itcast.demo07Function;

import java.util.function.Function;

/*
   Function接口的默认方法andThen:用来进行组合操作
   需求：
        把string类型的“123”转换为Integer类型，把转换后的结果+10
        把增加后的Integer类型数据转换为String类型

   分析：
        转换了两次
        第一次把string类型转换为Integer类型
            所以我们可以使用Function<String,Integer> fun1
            Integer i = fun1.apply("123")+10;

        第二次把Integer类型转换为String类型
            所以我们可以使用Function<Integer,String> fun2
            String s = fun2.apply(i);
       我们可以使用andThen方法，把两次转换组合在一起使用
        String s = fun1.andThen(fun2).apply("123");
        fun1先调用apply方法把字符串转换为Integer类型
        fun2再调用apply方法把Integer转换为String类型
 */
public class Demo02Function_andThen {
    /*
    定义一个方法
    参数串一个字符串类型的整数
    参数再传递两个Function接口
    Function<String,Integer>
    Function<Integer,String>
     */
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        //定义一个字符串类型的整数
        String s = "123";
        //调用change方法，传递字符串和两个lambda表达式
        change(s,(String str)->{
            return Integer.parseInt(s) + 10;
        },(Integer in)->{
            return in + "";
        });
        //优化lambda
        change(s,str->Integer.parseInt(s) + 10, in-> in + "");
    }
}
