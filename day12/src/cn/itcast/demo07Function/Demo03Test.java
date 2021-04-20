package cn.itcast.demo07Function;

import java.util.function.Function;

/*
     练习：自定义函数模型拼接
    请使用 Function 进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
    String str = "赵丽颖,20";

    分析：
    1. 将字符串截取数字年龄部分，得到字符串；
    Function<String,String> "赵丽颖，20"-》“20”
    2. 将上一步的字符串转换成为int类型的数字；
    Function<String ,Integer> "20" ->20
    3. 将上一步的int数字累加100，得到结果int数字。
    Function<Integer,Integer> 20->120

 */
public class Demo03Test {
    //定义一个方法传递一个字符串，和两个Function接口
    public static int  change(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "赵丽颖,20";

        //调用change方法，传递一个字符串和三个lambda表达式
        int change = change(s,(String str)->{
            return str.split(",")[1];
        },(String str) -> {
            return Integer.parseInt(str);
        }, (Integer in) -> {
            return in + 100;
        });
        System.out.println(change);
    }
}
