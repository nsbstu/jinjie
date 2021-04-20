package cn.itcast.demo04MyException;

/*
自定义异常类：
 java提供的异常类，不够我们使用，我们需要自己定义一些异常类
 格式：
 public class xxxException extends Exception|RuntimeException{
        添加一个空参数构造
        添加一个带异常信息的构造方法
        }
    注意：
     1：自定义异常类一般都是以Exception结尾，说明该类是一个异常类
     2：自定义异常类，必须继承Exception|RuntimeException
     Exception:编译期异常，如果方法内部抛出编译期异常,就必须处理，要么throws要么try catch
     RuntimeException:运行期异常，无需处理，交给jvm处理机（中断处理）
 */
public class RegisterException extends /*Exception*/RuntimeException {
    // 添加一个空参数构造
    public RegisterException() {

    }

    //添加一个带异常信息的构造方法
    //查源码所有的带异常信息的构造方法，方法内部会调用父类带异常构造方法，让父类去处理
    public RegisterException(String message) {
        super(message);
    }
}
