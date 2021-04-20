package cn.itcast.demo03Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写类型默认object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //创建GenericClass对象，泛型使用Interger
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        //创建GenericClass对象，泛型使用String
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小明");
        String name1 = gc3.getName();
        System.out.println(name1);


    }
}
