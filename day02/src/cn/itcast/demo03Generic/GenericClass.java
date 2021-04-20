package cn.itcast.demo03Generic;
/*
定义一个含有泛型的类模拟Arraylist集合
创建对象的时候确定泛型的数据类型
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
