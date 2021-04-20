package cn.itcast.demo08SynchronizedMethod;

/*
卖票案例实现，
创建三个线程，分别对共有的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        System.out.println("run:" + run);
        //run:cn.itcast.demo08SynchronizedMethod.RunnableImpl@7b23ec81
//创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();
    }
}
