package cn.itcast.demo09Lock;

/*
卖票案例实现，
创建三个线程，分别对共有的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
     RunnableImpl run = new RunnableImpl();
//创建Thread类对象，构造方法中传递Runnable接口的实现类对象
     Thread t0 = new Thread(run);
     Thread t1 = new Thread(run);
     Thread t2 = new Thread(run);

     t0.start();
     t1.start();
     t2.start();
    }
}
