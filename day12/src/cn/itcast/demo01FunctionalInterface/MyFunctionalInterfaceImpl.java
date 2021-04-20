package cn.itcast.demo01FunctionalInterface;
/*
     @Override注解
     检查方法是否为重写的方法
        是：编译成功
        否：编译失败
      @FunctionalInterface注解
        是：编译成功
        否：编译失败（接口中没有抽象方法，接口中抽象方法多于一个）
 */

public class MyFunctionalInterfaceImpl implements  MyFunctionalInterface{



    @Override
    public void method() {
        System.out.println("使用接口的实现类对象重写的抽象方法");
    }


    /*@Override
    public void method3() {

    }*/
}
