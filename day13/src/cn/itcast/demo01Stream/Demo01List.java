package cn.itcast.demo01Stream;



import java.util.ArrayList;
import java.util.List;

/*
使用传统的方式，遍历集合，对集合中的数据进行过滤
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个list集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        //对list集合中的元素进行过滤，只要以张开头的元素存储到一个新的集合中
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                listA.add(s);
            }
        }
        //对listA中的元素进行过滤，只要姓名长度为3的人，存储到一个新的集合中
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length() == 3){
                listB.add(s);
            }
        }
        //遍历输出listB

        for (String s : listB) {
            System.out.println(s);
        }


    }
}
