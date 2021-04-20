package cn.itcast.demo02Stream;

import java.util.stream.Stream;

/*
组合：concat
如果有两个流，希望合并成为一个流那么可以使用 Stream 接口的静态方法concat ：
static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)

 */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        //创建一个流
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "张无忌", "赵敏");

        //获取一个流
        String[] arr = {"喜羊羊", "美羊羊", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream2 = Stream.of(arr);
        //把以上两个流合并
        Stream<String> concat = Stream.concat(stream1, stream2);
        //遍历concat
        concat.forEach(name -> System.out.println(name));
    }
}
