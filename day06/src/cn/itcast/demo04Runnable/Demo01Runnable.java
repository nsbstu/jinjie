package cn.itcast.demo04Runnable;

/*
创建多线程的第二种方法，实现runnable接口
java.lang.Runnable
Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为 run 的无参数方法。
java.lang.Thread类的构造方法
Thread(Runnable target) 分配新的 Thread 对象。
Thread(Runnable target, String name) 分配新的 Thread 对象。
实现步骤：
1；创建一个Runnable接口的实现类
2：在实现类中重写run方法，设置线程任务
3：创建一个接口的实现类对象
4：创建Thread的对象，构造方法中传递接口的实现类对象
5：调用Thread的start方法，开启新线程的run方法

实现Runnable接口创建多线程程序的好处
1：避免了单继承的局限性
 一个类只能继承了一个类，类继承了Thread类不能继承其他类
 实现类Runnable接口，还可以继承其他的类，实现其他接口
 2：增强了程序的扩展性，降低了程序的耦合性（解耦）
   实现类Runnable接口的方式，把设置线程任务和开启线程任务进行了分离（解耦）
   实现类中重写了run方法用来设置线程任务
   创建Thread类对象，调用start方法，用来开启新线程
 */
public class Demo01Runnable {
    public static void main(String[] args) {

        //3：创建一个接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //4：创建Thread的对象，构造方法中传递接口的实现类对象
       // Thread t = new Thread(run);//打印线程名称
       Thread t = new Thread(new RunnableImpl2());//打印helloworld

        //5：调用Thread的start方法，开启新线程的run方法
        t.start();

        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
