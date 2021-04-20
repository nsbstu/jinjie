package cn.itcast.demo02Stream;

import java.util.stream.Stream;

/*
    可以通过 filter 方法将一个流转换成另一个子集流。方法签名：
    java.util.function.Predicate<T>
        该接口接收一个 Predicate 函数式接口参数（可以是一个Lambda或方法引用）作为筛选条件。
      复习Predicate接口
        此前我们已经学习过 java.util.stream.Predicate 函数式接口，其中唯一的抽象方法为：
        boolean test(T t)
        该方法将会产生一个boolean值结果，代表指定的条件是否满足。
            如果结果为true，那么Stream流的 filter 方法将会留用元素；
            如果结果为false，那么 filter 方法将会舍弃元素。
 */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        //创建一个流
        Stream<String> stream = Stream.of("张三丰", "张翠山", "张无忌", "赵敏");

        //对Stream进行过滤，只要姓张的人
        Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        //对stream2进行遍历
        stream2.forEach(name-> System.out.println(name));
        /*
        Stream流属于管道流，只能被消费（使用）一次
        第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
        而这时第一个Stream流已经使用完毕，就会关闭了
        所以第一个Stream流就不能再调用方法了
         */
        //遍历stream流
        //IllegalStateException: stream has already been operated upon or closed
        stream.forEach(name-> System.out.println(name));
    }
}
