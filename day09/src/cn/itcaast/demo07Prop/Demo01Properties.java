package cn.itcaast.demo07Prop;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties extends Hashtable <k,v> implement Map<k,v>
    Properties 类表示了一个持久的属性集。
    Properties集合是一个唯一与IO流相结合的集合
       可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
       可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用

    Properties 可保存在流中或从流中加载。
         Properties集合是一个双列集合，key和value默认都是字符串

 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
      可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
       void load(Reader reader)
       void load(InputStream inStream)

       参数：
        InputStream inStream：字节输入流，不能读取含有中文的键值对
        Reader reader ：字符输入流，能读取含有中文的键值对
       使用步骤：
         1：创建对象
         2：使用集合中的load读取保存键值对的文件
         3:遍历集合
        注意：
         1:存储键值对的文件中，键与值默认的连接符号可以使用=，空格（其他符号）
         2：存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取
         3:存储键值对的文件中，键与值默认都是字符串，不用再加引号
     */
    private static void show03() throws IOException {
        //1：创建对象
        Properties prop = new Properties();
        // 2：使用集合中的load读取保存键值对的文件
        prop.load(new FileReader("day09\\prop.txt"));
        //使用字节流会乱码，一般使用字符流
        // prop.load(new FileInputStream("day09\\prop.txt"));
        // 3:遍历集合
        //获取集合
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {

            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }


    /*
         可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
          void store(OutputStream , String comments)
          void store(Writer writer, String comments)
          参数：
          OutputStream  out：字节输出流，不能写入中文
          Writer writer    ：字符输出流，可以写中文
          String comments：注释，用来解释说明保存的文件是做什么用的
                        不能使用中文，会产生乱码，默认是unicode编码
                        一般使用”“空字符串

          使用步骤：
            1：创建Propeties集合对象，添加数据
            2：创建字节输出流、字符输出流对象，构造方法中绑定要输出的目的地
            3：使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
            4：释放资源
     */
    private static void show02() throws IOException {
        // 1：创建Propeties集合对象，添加数据

        Properties prop = new Properties();

        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");
        // 2：创建字节输出流、字符输出流对象，构造方法中绑定要输出的目的地

        // FileWriter fw = new FileWriter("day09\\prop.txt");

        // 3：使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储

        //prop.store(fw,"save data");
        // 4：释放资源

        // fw.close();
        //匿名对象使用完自己自动释放资源
        prop.store(new FileOutputStream("day09\\prop2.txt"), "");

    }



    /*
    使用Properties集合存储数据，遍历取出Properties集合中的数据
    Properties集合是一个双列集合，key和value默认都是字符串
    Properties集合含有一些操作字符串的特有方法
         Object setProperty(String key, String value)调用 Hashtable 的方法 put。
         String getProperty(String key)用指定的键在此属性列表中搜索属性。此方法相当于Map集合的get<key>方法
         Set<String> stringPropertyNames()返回此属性列表中的键集，其中该键及其对应值是字符串该方法相当于Map集合的keySet方法
     */

    private static void show01() {
        //创建对象
        Properties prop = new Properties();
        //使用setProperty往集合中添加数据
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");
        //使用stringPropertyNames()返回此属性列表中的键集set
        Set<String> set = prop.stringPropertyNames();
        //遍历集合，取出每一个键
        for (String key : set) {
            //getProperty(String key)用指定的键在此属性列表中搜索属性
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);

        }
    }
}
