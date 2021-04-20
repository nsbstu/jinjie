package cn.itcast.demo02Recursion;
/*
阶乘：所有小于及等于该数的正整数的积。
分析：这与累和类似,只不过换成了乘法运算，学员可以自己练习，需要注意阶乘值符合int类型的范围。
代码实现：
return num + getSum(num‐1);
}
}
n的阶乘：n! = n * (n‐1) *...* 3 * 2 * 1
推理得出：n! = n * (n‐1)!

 */
public class Demo03Recursion {
    public static void main(String[] args) {
        int s = jc(5);
        System.out.println(s);
    }
    public static int jc(int n){
        //结束条件
        if(n == 1){
            return 1;
        }
        //获取下一个被乘的数字n-1
        return n * jc(n - 1);
    }
}
