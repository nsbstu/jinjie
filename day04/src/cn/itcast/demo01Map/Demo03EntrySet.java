package cn.itcast.demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
map集合的方法
 Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。
 操作步骤与图解：
1. 获取Map集合中，所有的键值对(Entry)对象，以Set集合形式返回。方法提示: entrySet() 。
2. 遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象。
3. 通过键值对(Entry)对象，获取Entry对象中的键与值。 方法提示: getkey() getValue()


 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        //创建map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        //1. 获取Map集合中，所有的键值对(Entry)对象，
        // 以Set集合形式返回。方法提示: entrySet() 。
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //2. 遍历包含键值对(Entry)对象的Set集合，得到每一个键值对(Entry)对象。
        //迭代器遍历set集合
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            //通过键值对(Entry)对象，获取Entry对象中的键与值。
            // 方法提示: getkey() getValue()
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("==========");
        //增强for
        for (Map.Entry<String, Integer> entry : set) {
            //通过键值对(Entry)对象，获取Entry对象中的键与值。
            // 方法提示: getkey() getValue()
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
            
        }
    }
}
