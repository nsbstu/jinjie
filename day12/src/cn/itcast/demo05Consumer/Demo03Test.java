package cn.itcast.demo05Consumer;
/*
    下面的字符串数组当中存有多条信息，
    请按照格式“ 姓名：XX。性别：XX。 ”的格式将信息打印出来。
    要求将打印姓名的动作作为第一个 Consumer 接口的Lambda实例，
    将打印性别的动作作为第二个 Consumer 接口的Lambda实例，
    将两个 Consumer 接口按照顺序“拼接”到一起。

 */

import java.util.function.Consumer;

public class Demo03Test {
    //定义一个方法，参数是字符串数组，和两个consumer接口，泛型使用String
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        //遍历数组
        for (String message : arr) {
            //使用andthen连接两个接口，消费字符串
            con1.andThen(con2).accept(message);
        }
    }
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
      //匿名内部类
        printInfo(array, new Consumer<String>() {
            @Override
            public void accept(String s) {
                String name = s.split(",")[0];
                System.out.print("姓名：" + name);
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                String sex = s.split(",")[1];
                System.out.println("。性别：" + sex);
            }
        });






        //调用printInfo方法
        printInfo(array,(message)->{
            String name = message.split(",")[0];
            System.out.print("姓名：" + name);
        },(message)->{
            String sex = message.split(",")[1];
            System.out.println("。性别：" + sex);
        });
    }

}
