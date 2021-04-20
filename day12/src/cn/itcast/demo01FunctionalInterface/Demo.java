package cn.itcast.demo01FunctionalInterface;
/*
    函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class Demo {
    //定义一个方法，参数使用函数式接口MyFunctionalInterface
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法方法的参数是一个接口，所以传递的是接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //调用show方法方法的参数是一个接口，所以传递的是接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口的抽象方法");
            }
        });

        //调用show方法的参数是一个函数式接口，使用lambda表达式
        show(() ->{
            System.out.println("使用lambda表达式重写接口的抽象方法");
        });

        //lambda的简化
        show(() -> System.out.println("使用lambda表达式简化重写接口的抽象方法"));
    }
}
