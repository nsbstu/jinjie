package cn.itcast.demo02Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
当给HashMap中存放自定义对象时，如果自定义对象作为key存在，
这时要保证对象唯一，必须复写对象的hashCode和equals方法(如果忘记，请回顾HashSet存放自定义对象)。
如果要保证map中存放的key和取出的顺序一致，
可以使用 java.util.LinkedHashMap 集合来存放。
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }
/*
hashmap存储自定义类型键值
key:Person
person必须复写对象的hashCode和equals方法，可以保证key唯一
value：String，可以重复
 */
    private static void show02() {
        //创建hashmap集合
        HashMap<Person,String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",18),"俄国");
        map.put(new Person("女王",18),"毛里求茨");
        //使用entryset和增强for遍历
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }

    }



    /*
    hashmap存储自定义类型键值
    key:String类型
       String复写对象的hashCode和equals方法，可以保证key唯一

    value：Person类型
            value可以重复，（同名同年龄的人）
     */

    private static void show01() {
        //创建hashmap集合
        HashMap<String,Person> map = new HashMap<>();
        //往集合中添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));
        //使用keyset和增强for遍历v
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "-->" + value );
        }
    }
}
