package cn.itcast.demo07Integer;

import java.util.ArrayList;

/*
自动装箱与拆箱：
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
        自动装箱：直接把int类型整数赋值包装类
        Integer in = 1;相当于Integer in = new Inter=ger(1);
         */
        Integer in = 1;
        /*
        自动拆箱in 是包装类，无法直接参与运算，可以自动的转换为基本数据类型，在进行计算
        in+2;相当于in.intValue()+ 2;
         */
        in = in + 2;

        ArrayList<Integer> list = new ArrayList<>();
        /*
        无法直接存储整数，可以存储Integer包装类
         */
        list.add(1);//自动装箱
        int a = list.get(0);//自动拆箱
     }
}
