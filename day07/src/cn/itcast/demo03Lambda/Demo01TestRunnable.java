package cn.itcast.demo03Lambda;

/*
使用实现Runnable接口的方式实现多线程程序
 */
public class Demo01TestRunnable {
    public static void main(String[] args) {
        //创建接口的对象
        RunnableImpl run = new RunnableImpl();
        //创建线程对象,构造方法中传递Runnable的实现类
        Thread t = new Thread(run);
        //调用start开启线程，实现run方法
        t.start();


        //简化代码
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建新的线程");
            }
        };
        new Thread(r).start();

        //继续简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建新的线程");
            }
        }).start();
    }
}
