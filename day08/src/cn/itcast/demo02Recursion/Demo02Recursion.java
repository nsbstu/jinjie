package cn.itcast.demo02Recursion;
/*
计算1 ~ n的和
分析：num的累和 = num + (num-1)的累和，
所以可以把累和的操作定义成一个方法，递归调用。

 */
public class Demo02Recursion {
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);
    }
    public static int sum(int n){
        //结束条件
        if(n == 1){
            return 1;
        }
        //获取下一个被加的数字n-1
        return n + sum(n - 1);
    }
}
