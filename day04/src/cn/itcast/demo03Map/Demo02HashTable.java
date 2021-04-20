package cn.itcast.demo03Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
java.until.Hashtable<k,v>集合 implements Map<K,V>接口

hashtable：底层是一个哈希表，是线程安全的集合，是单线程，速度慢
hashmap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快

hashmap集合：可以存储null值和null键
hashtable集合：不能存储null值和null键

hashtable和vector集合一样被更先进的集合（hashmap，arraylist）取代
hashtaable的子类properties依然活跃在历史舞台
properties集合是唯一与io流相结合的集合

 */
public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);

        Hashtable<String,String> table = new Hashtable();
        //table.put(null,"a");//空指针异常
       /* table.put("b",null);
        table.put(null,null);*/
        //System.out.println(table);
    }
}
