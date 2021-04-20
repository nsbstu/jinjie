package cn.itcast.demo02Stream;

import java.util.stream.Stream;

/*
    如果需要将流中的元素映射到另一个流中，可以使用 map 方法。方法签名：
    java.util.function.Function<T,R>
    该接口需要一个 Function 函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
    复习Function接口
    此前我们已经学习过 java.util.stream.Function 函数式接口，其中唯一的抽象方法为：
    R apply(T t)
    这可以将一种T类型转换成为R类型，而这种转换的动作，就称为“映射”。
 */
public class Demo04Stream_map {
    public static void main(String[] args) {
        //获取一个String类型的Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法，把字符串类型的整数，转换（映射）为Integer类型的整数
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });

        //遍历stream2
        stream2.forEach(i -> System.out.println(i));
    }
}
