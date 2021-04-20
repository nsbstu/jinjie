package cn.itcast.demo01.BufferStream;

import java.io.*;
import java.util.HashMap;

/*
练习：
    对文本内容进行排序
    按照（1，2，3，4）顺序排序
分析：
    1：创建一个hashmap集合对象，key：存储每行文本的序号（1，2，3.。。）；value存储每行的文本
    2：创建字符缓冲输入流对象，构造方法中绑定字符输入流
    3：创建字符缓冲输出流对象，构造方法中绑定字符输出流
    4：使用字符缓冲输入流的readline方法，逐行读取文本
    5：对读到的文本进行切割，获取行中的序号和文本内容
    6：把切割好的序号和文本的内容存储到hashmap集合中（key序号是有序的，会自动排序1，2，3.。。）
    7：遍历hashmap集合，获取每一个键值对
    8：把每一个键值对拼接成一个文本行
    9：把拼接的文本，使用字符缓冲输出流中的方法write写入到文件中
    10：释放资源
 */
public class Demo05Test {
    public static void main(String[] args) throws IOException {
//    1：创建一个hashmap集合对象，key：存储每行文本的序号（1，2，3.。。）；value存储每行的文本
        HashMap<String, String> map = new HashMap<>();
//    2：创建字符缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("day10\\in.txt"));
//    3：创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\out.txt"));
//    4：使用字符缓冲输入流的readline方法，逐行读取文本
        String line;
        while ((line = br.readLine()) != null) {
            // 5：对读到的文本进行切割，获取行中的序号和文本内容
            String[] arr = line.split("\\.");
            /*System.out.println(arr[0]);
            System.out.println(arr[1]);*/
            // 6：把切割好的序号和文本的内容存储到hashmap集合中（key序号是有序的，会自动排序1，2，3.。。）
            map.put(arr[0],arr[1]);
        }

//    7：遍历hashmap集合，获取每一个键值对
        for (String key : map.keySet()) {
            String value = map.get(key);
            //    8：把每一个键值对拼接成一个文本行
            line = key + "." + value;
            //    9：把拼接的文本，使用字符缓冲输出流中的方法write写入到文件中
            bw.write(line);
            bw.newLine();//写个换行
        }
//    10：释放资源
        bw.close();
        br.close();

    }
}
