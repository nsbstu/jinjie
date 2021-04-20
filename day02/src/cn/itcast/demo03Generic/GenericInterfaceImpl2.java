package cn.itcast.demo03Generic;
/*
含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用什么泛型
 类跟着接口走
 就相当于定义了一个含有泛型的类：例如Arraylist类实现list接口

 */
public class GenericInterfaceImpl2<I> implements  GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
