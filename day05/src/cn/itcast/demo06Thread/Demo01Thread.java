package cn.itcast.demo06Thread;
/*
创建多线程程序的第一种方式：创建Thread的子类
java.lang.thread类是描述线程的类，我们想要实现多线程程序，就必须继承thread类
实现步骤：
   1：创建一个Thread子类
   2：在子类中重写thread的run方法，设置线程任务
   3：创建thread类的子类对象
   4：调用thread类中的方法start方法，开启新的线程，执行run
     void start（）是线程开始执行；java虚拟机调用线程的run方法。
     结果是两个线程并发地运行；
        当前线程（main）和另一个线程（创建的新线程，执行run方法）。
        多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
java程序属于抢占式调度，哪个线程优先级高哪个就优先；同一个优先级，随机选择一个执行
 */
public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }
}
