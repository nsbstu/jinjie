package cn.itcast.demo03Exception;
/*
如果finally有return语句,永远返回finally中的结果,避免该情况.
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }
    public static int getA(){
        int a = 10;
        try{
           return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
          a = 100;
            return a;
        }
    }
}
