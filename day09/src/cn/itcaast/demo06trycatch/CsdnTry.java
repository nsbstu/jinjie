package cn.itcaast.demo06trycatch;

public class CsdnTry {

        public static int add(int x,int y){
        /* 如果除数不为零时，则不会发生异常catch语句块里面的语句不会执行，
           但是try里面return语句的++x会执行，同样除数为零则try的return不执行，catchreturn会执行。最后在finally中的return返回。*/
            try {
                int num=x/y;
                return ++x;
            }catch (Exception e) {
                System.out.println(e.toString());
                return ++x;
            }finally{
                System.out.println("finally");
                return x;
                //		x++
            }
        }
        public static void main(String[] args) {

            int number=add(4,0);
            System.out.println("number="+number);        //控制台打印：number=5
        }



}
