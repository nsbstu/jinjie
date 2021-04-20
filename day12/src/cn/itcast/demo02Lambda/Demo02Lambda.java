package cn.itcast.demo02Lambda;
/*
    使用lambda优化日志案例
    lambda的特点：延迟加载
    lambda的使用前提，必须存在函数时接口
 */
public class Demo02Lambda {
    //定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level,MessageBuilder mb){
        //对日志的等级进行判断，如果是1级，调用MessageBuilder接口的builderMessgae方法
        if(level == 1){
            System.out.println(mb.builderMessage());
        }

    }

    public static void main(String[] args) {
        //定义 三个日志信息
        String msg1 = "Hello";
        String msg2 = "world";
        String msg3 = "Java";
        //调用showLog方法，参数是MessageBuilder的一个函数式接口，所以可以传递lambda表达式
        /*showLog(2,()->{
            //返回一个拼接好的字符串
            return msg1 + msg2 + msg3;
        });*/
        /*
        使用lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
        只要条件满足，日志的等级是1
            才会调用接口MessageBuilder中的方法builderMessage
            才会进行字符串的拼接
        如果条件不满足，日志的等级不是1ji
            那么MessageBuilder接口中的方法builderMessage也不会执行
            所以拼接字符串的代码不会执行
        所以不会存在性能的浪费
         */
        showLog(1,()->{
            System.out.println("不满足条件不执行");
            //返回一个拼接好的字符串
            return msg1 + msg2 + msg3;
        });
    }
}
