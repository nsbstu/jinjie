package cn.itcaast.demo06trycatch;

public class ExceptionDemo {
    public int add(int a,int b) throws FusuException{

        if(b<0)
            throw new FusuException("出现了除数为负数的情况");
        return a/b;
    }
}
