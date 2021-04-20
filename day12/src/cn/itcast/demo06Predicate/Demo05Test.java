package cn.itcast.demo06Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
     练习：集合信息筛选

数组当中有多条“姓名+性别”的信息如下，
请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合ArrayList 中，
需要同时满足两个条件：
1. 必须为女生；
2. 姓名为4个字。

分析：
 1：有两个判断条件，所以需要使用两个predicate接口，对条件进行判断
 2：必须同时满足两个条件，所以使用and方法连接两个判断条件

 */
public class Demo05Test {
    /*
    定义一个方法，
    参数是一个字符串数组，和两个Predicate接口
   把满足条件的信息存储到Arraylist集合中并返回

     */
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        //定义一个Arraylist集合，存储过滤后的信息
        ArrayList<String>  list = new ArrayList<>();
        //遍历数组，获取数组中的每一条信息
        for (String s : arr) {
            //使用predicate接口中的test方法判断
            boolean b = pre1.and(pre2).test(s);
            //对得到的b进行判断
            if(b){
                list.add(s);
            }
        }
        //把集合返回
        return list;
    }

    public static void main(String[] args) {
        //定义一个字符串数组
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        //调用filter方法传递字符数组和两个lambda表达式

        ArrayList<String> list = filter(array, (String s) -> {
            //必须为女生
            return s.split(",")[1].equals("女");
        }, (String s) -> {
            //姓名为4个字
            return s.split(",")[0].length() == 4;
        });
        //遍历集合
        for (String s : list) {
            System.out.println(s);
        }
    }
}
