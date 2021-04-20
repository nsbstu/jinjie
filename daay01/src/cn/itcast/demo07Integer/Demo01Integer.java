package cn.itcast.demo07Integer;
/*
装箱
构造方法
Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值。
Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
静态方法
static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。
拆箱
int intValue()以 int 类型返回该 Integer 的值。

 */
public class Demo01Integer {
    public static void main(String[] args) {
        //装箱
        Integer in1 = new Integer(1);//方法上有横线，说明方法过时
        System.out.println(in1);//重写了toString方法

        Integer in2 = new Integer("1");//方法上有横线，说明方法过时
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        //Integer in4 = Integer.valueOf("a");//NumberFormatException数据格式化异常
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);
        //拆箱
        int i = in1.intValue();
        System.out.println(i);


    }
}
