package cn.itcast.demo04Lambda;
/*
给定一个厨子 Cook 接口，内含唯一的抽象方法 makeFood ，且无参数、无返回值。
在下面的代码中，请使用Lambda的标准格式调用 invokeCook 方法，打印输出“吃饭啦！”字样：
 */
public class Demo01Cook {
    public static void main(String[] args) {
//调用invokeCook方法，参数是Cook接口，传递接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //使用Lambda方法,简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("吃饭了");
        });

        //优化省略lambda
        invokeCook(()-> System.out.println("吃饭了"));
    }

    //定义一个方法，参数传递cook接口，方法内部调用cook接口中的方法makefood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
