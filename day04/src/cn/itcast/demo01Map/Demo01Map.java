package cn.itcast.demo01Map;

import java.util.HashMap;
import java.util.Map;


/*
java.until,map<k,v>集合
map集合特点：
        1：map集合是一个双列集合，一个元素包括两个值（key，value）
        2：map中的元素，key和value数据类型可以相同，也可以不同
        3:map集合的元素key不允许重复，value可以重复
        4：map集合的元素key和value是一一对应的

java.until,hashmap<k,v>集合 implements map<k,v>接口
hashmap特点：
        1：hashmap底层是哈希表：查询速度特别快
                1.8之前，数组+单向链表
                1.8之后：数组加单向链表/红黑树（链表长度超过8）：提高查询速度
        2：hashmap是一个无序的集合，存储元素和取出元素的顺序可能不一致
java.until.Linkedhashmap<k,v>集合 implements map<k,v>接口
linkedhashmap特点：
        1：底层是哈希表+链表（保证迭代的顺序）
        2：是一个有序的集合，存储元素和取出元素的顺序是一致的


public V put(K key, V value) : 把指定的键与指定的值添加到Map集合中。
public V remove(Object key) : 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的
值。
public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 boolean containsKey(Object key)  如果此映射包含指定键的映射关系，则返回 true。

 */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }
/*
 boolean containsKey(Object key)  如果此映射包含指定键的映射关系，则返回 true。
        包含返回true，不包含返回false
 */
    private static void show04() {
        //创建map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);

        boolean b1 = map.containsKey("赵丽颖");
        System.out.println("b1:"+ b1);
        boolean b2 = map.containsKey("林志颖");
        System.out.println("b2:" + b2);
    }

    /*
    public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
     v:
        key存在，返回是值
        key不存在，返回null
     */
    private static void show03() {
        //创建map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);

        Integer v1 = map.get("赵丽颖");
        System.out.println("v1:" + v1);//v1:168
        System.out.println(map);

        Integer v2 = map.get("林志颖");
        System.out.println("v2:"+ v2);//v2:null
    }

    //public V remove(Object key) :
// 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的
//值。
    /*
    v:
    key存在，返回被删除是值
    key不存在，返回null
     */
    private static void show02() {
        //创建map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);//无序

        Integer v1 = map.remove("林志玲");
        System.out.println("v1:" + v1);//v1:178
        System.out.println(map); //  {赵丽颖=168, 杨颖=165}

        Integer v2 = map.remove("林志颖");
        System.out.println("v2:" + v2);//v2:null
        System.out.println(map);// {赵丽颖=168, 杨颖=165}
    }

    //public V put(K key, V value) : 把指定的键与指定的值添加到Map集合中。
    /*
    返回值v
      存储键值对的时候，key不重复，返回v是null
      key重复，会使用新的value替换掉map里的value，返回被替换的value
     */
    private static void show01() {
//创建map集合对象，多态
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:" + v1);//v1:null

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:" + v2);//v2:范冰冰1
        System.out.println(map);//{李晨=范冰冰2}

        map.put("冷风", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);


    }
}
