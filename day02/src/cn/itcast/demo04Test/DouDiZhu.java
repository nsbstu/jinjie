package cn.itcast.demo04Test;

import java.util.ArrayList;
import java.util.Collections;

/*
斗地主综合案例：
1：准备牌
2：洗牌
3：发牌
4：看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        //定义一个存储54张牌的Arraylist集合泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，分别存放花色和序号
        String[] colors = {"♣","♥","♠","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //存入大小王
        poker.add("大王");
        poker.add("小王");

        //循环遍历两个数组，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color + number);
                //存入poker
                poker.add(color + number);
            }
        }
       // System.out.println(poker);


        //洗牌  集合工具类的Collections的方法static void shuffle
        Collections.shuffle(poker);
        //System.out.println(poker);

        //发牌
        //定义四个集合存放玩家和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        //遍历poker集合获取每一张牌
        //poker集合的索引%3，给三个玩家轮流发牌，
        //剩余三张底牌
        //注意：
        //   先判断底牌（i》=51），否则牌就没了
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            //轮流发牌
            if(i >= 51){
                //给底牌发牌
                diPai.add(p);
            }else if(i % 3 == 0){
                player01.add(p);
            }else if(i % 3 == 1){
                player02.add(p);
            }else{
                player03.add(p);
            }
        }
        //看牌
        System.out.println("周润发：" + player01);
        System.out.println("刘德华： " + player02);
        System.out.println("周星驰：" + player03);
        System.out.println("底牌：" + diPai);

    }
}
