package cn.itcast.demo01WaitAndNotify;

/*
消费者（吃货）类：是一个线程类，可以继承Thread
设置线程任务run：吃包子
对包子状态进行判断
false：没包子
  吃货调用wait方法进入等待状态
true：有包子
    吃货吃包子
    吃货吃完包子
    修改包子的状态为false
    吃货唤醒包子铺，生产包子
 */
public class ChiHuo extends Thread {
    //设置一个包子变量
    private BaoZi bz;
    //2：使用带参数构造方法，为这个包子变量赋值

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务吃包子
    @Override
    public void run() {
        //使用死循环让吃货一直吃包子
        while (true) {
            //必须同时同步技术，保证两个线程只有一个正在执行
            synchronized (bz) {
                //false：没包子
                //  吃货调用wait方法进入等待状态
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃" + bz.pi + bz.xian + "包子");
                //吃货吃完包子
                //修改包子的状态为false
                bz.flag = false;

                //唤醒包子铺
                bz.notify();
                System.out.println("吃货已经把" + bz.pi + bz.xian + "包子吃完了，包子铺开始生产包子");
                System.out.println("=================");
            }
        }


    }
}
