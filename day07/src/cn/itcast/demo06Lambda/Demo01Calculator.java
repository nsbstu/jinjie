package cn.itcast.demo06Lambda;
/*
给定一个计算器 Calculator 接口，内含抽象方法 calc 可以将两个int数字相加得到和值：
在下面的代码中，请使用Lambda的标准格式调用 invokeCalc 方法，完成120和130的相加计算：
 */
public class Demo01Calculator {
    public static void main(String[] args) {

        //调用invokeCalc方法，方法的参数是一个接口，可以使用匿名内部类
        invokeCalc(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        //使用lambda表达式简化代码
        invokeCalc(120,130,(int a, int b)-> {
                return a + b;
            });

        //优化省略lambda
        invokeCalc(120,130,(a, b)-> a + b);
    }
    /*
    定义一个方法
    参数传递两个int类型的整数
    参数传递Calcultora接口
    方法的内部调用Calculator 的方法calc，计算两个整数的和
     */
    public static void invokeCalc(int a,int b,Calculator c){
       int sum =  c.calc(a,b);
        System.out.println(sum);
    }
}
