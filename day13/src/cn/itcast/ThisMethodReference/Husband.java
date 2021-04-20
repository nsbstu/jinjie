package cn.itcast.ThisMethodReference;
/*
    通过this引用本类的成员方法
 */
public class Husband {
    //定义一个买房子的方法
    public void buyHouse(){

        System.out.println("北京二环内买一套四合院");
    }
    //定义一个结婚的方法，参数传递的是Richable接口
    public void  marry(Richable r){
        r.buy();
    }
    //定义一个非常高兴的方法
    public void soHappy(){
        //调用结婚的方法，方法的参数Richable是一个函数式接口，传递lambda表达式
        /*marry(()->{
            //使用this.成员方法，调用本类买房子的方法
            this.buyHouse();
        });*/

        /*
            使用方法引用优化lambda表达式
            this已经存在
            本类的成员方法buyHouse已经存在
            所以我们可以直接使用this引用本类的成员方法buyHouse
         */
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
