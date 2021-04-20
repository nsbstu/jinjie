package cn.itcast.demo01WaitAndNotify;
/*
测试类：
包含main方法，程序的执行入口，启动程序
创建包子对象
创建包子铺线程开启生产包子
创建吃货线程，开启，吃包子
 */
public class Demo {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建包子铺线程开启生产包子
        new BaoZiPu(bz).start();
        //创建吃货线程，开启，吃包子
        new ChiHuo(bz).start();
    }
}
