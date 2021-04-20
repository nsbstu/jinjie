package cn.itcast.demo04Supplier;

import java.util.function.Supplier;

/*
    2 练习：求数组元素最大值
    使用 Supplier 接口作为方法参数类型，
    通过Lambda表达式求出int数组中的最大值。
    提示：接口的泛型请使用java.lang.Integer 类。

 */
public class Demo02Test {
    //定义一个方法，参数是Supplier接口，泛型使用Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个数组并赋值
        int[] arr = {22,-23,66,64,99,-90};
        //调用getMax方法，由于参数是一个函数式接口，可以使用lambda传递
        int maxvalue = getMax(() -> {
            //定义一个max存放最大值
            int max = arr[0];
            //遍历数组，与max比较
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;

        });
        System.out.println(maxvalue);
    }
}
