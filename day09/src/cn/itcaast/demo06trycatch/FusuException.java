package cn.itcaast.demo06trycatch;

public class FusuException extends Exception{
    private int value;
    FusuException(){}

    FusuException(String msg){
        super(msg);
    }

    FusuException(String msg,int value){
        super(msg);
        this.value=value;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
