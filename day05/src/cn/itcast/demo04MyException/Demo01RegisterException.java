package cn.itcast.demo04MyException;

import java.util.Scanner;

/*
要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册
 分析：
 1：使用数组保存已经注册的用户名（数据库）
 2：使用scanner获取用户输入的注册的用户名（前端和页面）
 3：定义一个方法，对用户输入中的注册的用户名进行判断
    遍历存储已经注册过的用户名的数组，获取每一个用户名
    使用获取到的用户名和用户输入的用户名比较
        true：
            用户名已存在，抛出RegisterException异常，告知用户名已经注册
        false：
          继续遍历查找
    如果循环结束，还没有找到重复的用户名，提示用户“恭喜您，注册成功！”


 */
public class Demo01RegisterException {
    static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) throws RegisterException {
        //2：使用scanner获取用户输入的注册的用户名（前端和页面）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要注册的用户名：");
        String username = sc.next();
        checkUsername(username);
    }

    // 3：定义一个方法，对用户输入中的注册的用户名进行判断
    public static void checkUsername(String username) /*throws RegisterException */{
        for (String name : usernames) {
            // 使用获取到的用户名和用户输入的用户名比较
            if (name.equals(username)) {
                //true：
                //    用户名已存在，抛出RegisterException异常，告知用户名已经注册
                try {
                    throw new RegisterException("亲，该用户已注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return ;//结束程序
                }
            }
        }
        //  如果循环结束，还没有找到重复的用户名，提示用户“恭喜您，注册成功！”
        System.out.println("恭喜您，注册成功！");
    }
}
