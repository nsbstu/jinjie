package cn.itcast.demo05ObjectMethodReference;
/*
 通过对象名引用成员方法
 使用前提是对象名已经存在的，成员方法也是已经存在
 就可以使用对象名来引用成员方法
 */

public class Demo01ObjectMethodReference {
    //定义一个方法，方法的参数传递的Printable接口
    public static void printString(Printable p ){
        p.print("hello");
    }

    public static void main(String[] args) {
        //调用printString方法，方法的参数是一个函数式接口，所以可以传递lambda表达式
        printString((s)->{
            //创建MethodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            //调用MethodRerObject对象中的printUpperCaseString方法，把字符串类型的按照大写输出
            obj.printUpperCaseString(s);
        });
        /*
            使用方法引用优化lambda
            对象名已经存在MethodRerObject
            成员方法也是已经存在的printUpperCaseString
            所以我们可以使用对象名引用成员方法
         */
        //创建MethodRerObject对象
        MethodRerObject obj = new MethodRerObject();
        printString(obj :: printUpperCaseString);
    }
}
