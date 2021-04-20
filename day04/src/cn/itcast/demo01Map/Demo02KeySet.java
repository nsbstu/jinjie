package cn.itcast.demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
map遍历的第一种方法：通过键找值的方式
map集合的方法：
Set<k> keyset()返回此映射中包含的键的set视图
实现步骤：
1:使用map集合的keyset（）方法，把map集合所有的key取出来，存储到一个set集合中
2：遍历set集合，获取map集合的每一个key
3：通过map集合的get（key),通过key找到value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        //创建map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        //1:使用map集合的keyset（）方法，
        // 把map集合所有的key取出来，存储到一个set集合中
        Set<String> set = map.keySet();

        //2：遍历set集合，获取map集合的每一个key
        //使用迭代器遍历set集合
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            //3：通过map集合的get（key),通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "="+ value);
        }
        System.out.println("=========");
        //增强for遍历
        for (String key : set) {

            //3：通过map集合的get（key),通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "="+ value);
        }

        System.out.println("=======");
        //增强for遍历
        for (String key : map.keySet()) {

            //3：通过map集合的get（key),通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "="+ value);
        }
    }
}
