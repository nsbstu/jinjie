package cn.itcaast.demo06trycatch;

public class LamdbaDemo1 {
    public static void main(String[] args) throws FusuException{
        ExceptionDemo ed = new ExceptionDemo();

        try {
            int x = ed.add(4,-21);
            System.out.println(x);
        } catch (FusuException e) {
            // TODO Auto-generated catch block
            System.out.println("除负数异常");
            //  System.out.println("除负数异常,负数为"+e.getValue());
        }
        System.out.println("Over");
    }

}
