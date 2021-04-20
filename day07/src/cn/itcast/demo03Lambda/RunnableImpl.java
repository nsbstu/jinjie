package cn.itcast.demo03Lambda;
/*
c创建Runnable接口的实现类
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建新的线程");
    }
}
