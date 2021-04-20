package cn.itcast.demo03Lambda;
/*
Lambda省去面向对象的条条框框，格式由3个部分组成：
一些参数
一个箭头
一段代码
Lambda表达式的标准格式为：
(参数类型 参数名称) ‐> { 代码语句 }
():接口抽象方法的参数列表，没有参数就空着；多个参数用，隔开
->；传递的意思，把参数传递给方法体{}
{}:重写接口的抽象方法的方法体
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类方法，实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建新的线程");
            }
        }).start();


        //使用lambda方法实现多线程
        new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "创建新的线程");
            }
        ).start();

        //优化省略lambda

        new Thread(()->
            System.out.println(Thread.currentThread().getName() + "创建新的线程")
        ).start();
    }

}
