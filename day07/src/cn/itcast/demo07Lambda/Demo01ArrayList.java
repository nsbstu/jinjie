package cn.itcast.demo07Lambda;

import java.util.ArrayList;

/*
Lambda强调的是“做什么”而不是“怎么做”，所以凡是可以根据上下文推导得知的信息，都可以省略
 省略规则
在Lambda标准格式的基础上，使用省略写法的规则为：
1. 小括号内参数的类型可以省略；
2. 如果小括号内有且仅有一个参，则小括号可以省略；
3. 如果大括号内有且仅有一个语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。
   注意：要省略  大括号、return关键字及语句分号 要一起省略

 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //jdk1.7之前，创建对象需要把前后的泛型都写出来
        ArrayList<String> list01 = new ArrayList<String>();
        //jdk1.7之后，创建对象的泛型，后边的可以省略，后边的泛型会根据前边的泛型推导出来
        ArrayList<String> list02 = new ArrayList<>();
    }
}
