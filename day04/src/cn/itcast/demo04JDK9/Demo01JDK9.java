package cn.itcast.demo04JDK9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Jdk9的新特性：
        List接口，set接口，map接口：里边增加了一个静态方法of，可以一次性添加多个元素
        static 《E》list《E》of（E...elements）
        使用前提：
            当集合中的元素的个数已经确定了，不在改变时使用
        注意：
            1：of方法只适用于list接口，set接口，map接口，不适用于接口的实现类
            2：of方法的返回值是一个 不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
            3：set和map接口在调用of方法时不能有重复的元素，否则会抛出异常

 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c","d");
        System.out.println(list);
      //  list.add("w");//UnsupportedOperationException:不支持操作异常

        //Set<String> set = Set.of("a", "b", "a", "c", "d");
        Set<String> set = Set.of("a", "b",  "c", "d");
        System.out.println(set);//IllegalArgumentException非法参数异常

        //Map<Object, Object> map = Map.of("张三",18,"李四",15,"王五",18);
        Map<Object, Object> map = Map.of("张三",18,"李四",15,"张三",18);
        System.out.println(map);//IllegalArgumentException

    }
}