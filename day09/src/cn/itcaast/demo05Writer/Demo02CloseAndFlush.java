package cn.itcaast.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
flush和close方法的区别
    void flush() 刷新缓冲区，流对象可以继续使用
    void close() 先刷新缓冲区，然后通知系统释放资源，流对象不可以再被使用了。
 */
public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        //1:创建FileWriter对象，构造方法中要绑定写入数据的目的地
        FileWriter fw = new FileWriter("day09\\e.txt");
        //2：使用FileWriter的方法write，把数据写入到内存缓冲区（字符转换为字节）
        fw.write(97);
        //3：使用FileWriter中的方法flush，把内存缓冲区的数据，刷新到文件中
        fw.flush();
        //刷新之后可以继续使用
        fw.write(98);
        //4：释放资源（会先把内存缓冲区的数据刷新到文件中）
        //fw.close();
        //close方法之后流已经关闭了，已经从内存中消失了，流就不能继续使用了
       // fw.write(99);//IOException: Stream closed
    }
}
