package cn.itcast.demo06ThreadSafe;

/*
实现卖票案例
 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环让卖票任务重复进行
        while (true) {

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
        }
    }
}
