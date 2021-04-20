package cn.itcast.demo05Thread;
/*
主线程：执行主（main）方法的线程
单线程程序：java中只有一个线程
执行从main开始，从上到下依次执行

jvm执行main方法，main方法会进入栈内存
jvm会找操作系统开辟一条main方法通向cpu的执行路径
cpu就可以通过这个路径来执行main方法
而这个路径只有一个名字，叫main（主）线程
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小明");
        p1.run();
        System.out.println(0/0);//ArithmeticException: / by zero
        Person p2 = new Person("小强");
        p2.run();
    }
}
