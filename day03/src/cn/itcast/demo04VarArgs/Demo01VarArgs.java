package cn.itcast.demo04VarArgs;

/*
    可变参数：JDK1.5后出现的特性
    使用前提：
           当方法的参数列表的数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用方法：定义方法时使用
      修饰符 返回值类型 方法名 （数据类型。。。变量名）{}
     可变参数的原理：
        底层就是一个数组，根据传递参数的个数不同，会创建不同长度的数组，来存储
        这些参数，  传递的参数的个数可以是0个（不传递），1，2，3.。。多个

 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        //int i = add(10);
        int i = add(10,20,30,40,50,60,70,80,90,100);
        System.out.println(i);


        method("abc",5.5,10,1,2,3,4);
    }
 /*
 可变参数的特殊（终极)写法
  */
 /*public static void method(Object...obj){

 }*/


    /*
    可变参数的注意事项：
            1：一个方法的参数列表，只能有一个可变参数
            2：如果方法的参数有多个，那么可变参数必须写在参数列表的末尾

     */
   /* public static void method(int...a,String...b){

    }*/
    public static void method(String b,double c,int d,int...a){

    }


    /*
    定义0-n个整数的和的方法
    已知：计算整数的和，数据类型已经确定int
    但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
    add()就会创建一个长度为0 的数组new int [0]
     */
    public static int add(int... arr) {
        //System.out.println(arr);//底层是数组
        //System.out.println(arr.length);//0
        //定义初始化的变量，记录累加和
        int sum = 0;
        //遍历数组，获取数组中的每一个元素
        for (int i : arr) {
            //累加求和
            sum += i;
        }
        //把求和结果返回
        return sum;
    }


   /* //定义一个方法，计算三个int类型元素的和
    public static  int add(int a,int b,int c){
        return a + b + c ;
    }
    //定义一个方法，计算两个int类型元素的和
    public static  int add(int a,int b){
        return a + b ;
    }
*/
}
