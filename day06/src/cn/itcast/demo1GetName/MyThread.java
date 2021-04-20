package cn.itcast.demo1GetName;
/*
获取线程名称：
1:使用Thread类的getname（）
 String getName() 返回该线程的名称。
 2：先获取当前正在执行的线程，使用线程中的方法getname获取线程的名称
  static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
//创建一个thread的子类
public class MyThread extends Thread{
    //重写run方法，设置线程任务
    @Override
    public void run() {
        //获取线程名称
        /*String name = getName();
        System.out.println(name);*/
        /*Thread t = Thread.currentThread();
        System.out.println(t);//Thread[Thread-0,5,main]

        String name = t.getName();
        System.out.println(name);// Thread-0*/
//链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
