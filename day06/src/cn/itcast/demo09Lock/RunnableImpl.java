package cn.itcast.demo09Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
卖票案例出现了安全问题
卖出了不存在的票或者重复的票

解决安全问题的第三种方法，使用lock锁
java.util.concurrent.locks  Lock接口
Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作
Lock接口中的方法：
 void lock()获取锁。
void unlock() 释放锁。
java.util.concurrent.locks.ReentrantLock implement lock接口

步骤：
1：创建一个ReentrantLock对象
2：在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
3：在可能出现安全问题的代码后调用lock接口中的方法unlock获取锁
 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;
    //1：创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环让卖票任务重复进行
        while (true) {
            //2：在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
            l.lock();
            //先判断是否有票
            if (ticket > 0) {
                //提高安全问题出现的概率，让程序睡眠一下
                try {
                    Thread.sleep(10);
                    //票存在，卖票
                    System.out.println(Thread.currentThread().getName() + "-->第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //3：在可能出现安全问题的代码后调用lock接口中的方法unlock获取锁
                    l.unlock();//无论程序是否异常，都会把锁释放
                }
            }
        }
    }




/*    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环让卖票任务重复进行
        while (true) {
//2：在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
            l.lock();
            //先判断是否有票
            if (ticket > 0) {
                //提高安全问题出现的概率，让程序睡眠一下
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票
                System.out.println(Thread.currentThread().getName() + "-->第" + ticket + "张票");
                ticket--;
            }
            //3：在可能出现安全问题的代码后调用lock接口中的方法unlock获取锁
            l.unlock();
        }
    }*/
}
