package cn.itcast.demo03hashCode;
/*
哈希值：是一个十进制的整数，由系统随机给出的
（就是对象的地址值，是一个逻辑地址，是模拟出来的地址，不是数据的实际存储的物理地址）
 在object类中有一个方法，可以获取对象的哈希值
  int hashCode()返回该对象的哈希码值
  hashCode方法的源码：
            public native int hashCode();
       native：代表该方法调用的是本地操作系统的方法
 */
public class Demo01hashCode {
    public static void main(String[] args) {
        //Person类继承了object类，所以使用Object的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);


        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);


        /*
        toString原码
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);


        /*
        String 类的哈希值
            string类重写了object类的hashCode方法
         */

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //重地==通话的哈希值
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

    }

}
