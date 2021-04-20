package cn.itcast.demo06Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
斗地主综合案例：有序版本
1：准备牌
2：洗牌
3：发牌
4：排序
5：看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1：准备牌
        //创建map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个list集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        //定义两个集合存储花色和牌的序号
        List<String> colors = List.of("♣", "♥", "♠", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //先把大王和小王存储到集合中
        //定义牌的索引
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历两个集合，组装52张牌，存储到集合中
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color + number);
                pokerIndex.add(index);
                index++;
            }
        }
      /*  System.out.println(poker);
        System.out.println(pokerIndex);*/

        //2:洗牌Collections.shuffle(list);
        Collections.shuffle(pokerIndex);
        //System.out.println(pokerIndex);


        //发牌
        //定义四个集合存储玩家牌的索引和底牌的索引
        ArrayList<Integer> play01 = new ArrayList<>();
        ArrayList<Integer> play02 = new ArrayList<>();
        ArrayList<Integer> play03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        //遍历存储牌索引的list集合，获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if(i >= 51){
                //给底牌发牌
                diPai.add(in);
            }else if(i % 3 == 0){
                //给玩家1发牌
                play01.add(in);
            }else if(i % 3 == 1){
                //给玩家2发牌
                play02.add(in);

            }else{
                //给玩家3发牌
                play03.add(in);
            }
        }

        /*
        4：排序
            使用Collections的sort（list）
            默认升序排序
         */
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(diPai);



        /*
        5:看牌
        调用看牌的方法
         */
        lookPoker("刘德华",poker,play01);
        lookPoker("周润发",poker,play02);
        lookPoker("周星驰",poker,play03);
        lookPoker("底牌",poker,diPai);
    }

    /*
    定义一个看牌的方法，提高代码的复用性
    参数：
        String name:玩家名称
        HashMap<Integer,String> poker:存储牌的poker集合
        ArrayList<Integer> list:存储玩家和底牌的list集合
    查表法：
        遍历玩家或者底牌集合，获取牌的索引
        使用牌的索引，去Map集合中，找到对应的牌
     */

    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        //输出玩家的名称，不换行
        System.out.print(name + ":");
        //遍历玩家或者底牌集合，获取牌的索引
        for (Integer key : list) {
            // 使用牌的索引，去Map集合中，找到对应的牌
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();//打印完每一个玩家的牌换行
    }
}
