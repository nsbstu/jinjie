package cn.itcast.demo04BSTcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
创建BS版本的tcp服务器
 */
public class TCPSeverThread {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket，和系统要指定的端口
        ServerSocket server = new ServerSocket(8080);
        /*
        浏览器解析服务器回写的html页面，页面如果有图片，那么浏览器就会单独开启一个线程，读取服务器的图片
        我们就得让服务器一直处于监听状态，客户端请求一次，服务器就回写一次

         */
        while (true) {
            //使用accept方法获取到请求的客户端对象（浏览器）
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        //使用Socket对象的方法getInputStream，获取网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //使用字节输入流对象InputStream的方法read读取客户端的请求信息
              /*byte[] bytes = new byte[1024];
                 int len = 0;
                 while((len = is.read(bytes)) != -1){
                     System.out.println(new String(bytes,0,len));
                 }*/

                        //把is网络字节输入流转换为字符缓冲输入流
                        //InputStreamReader 字节-》字符
                        //BufferedReader字符流- 》字符缓冲流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //把客户端请求的信息的第一行读取出来 GET /day11/web/index.html HTTP/1.1
                        String line = br.readLine();
                        //System.out.println(line);
                        //把读取出来的信息只要中间部分 /day11/web/index.html
                        String[] arr = line.split(" ");
                        //把路径前面的/去掉，进行截取  day11/web/index.html
                        String htmlpath = arr[1].substring(1);
                        //System.out.println(htmlpath);
                        //创建一个本地字节输入流，构造方法中绑定要读取的html的路径
                        FileInputStream fis = new FileInputStream(htmlpath);
                        //使用socket中的方法getoutputstream获取网络字节输出流OutputStream
                        OutputStream os = socket.getOutputStream();

                        // 写入HTTP协议响应头,固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\r\n".getBytes());
                        //一读一写复制文件，把服务器读取的html文件回写到客户端
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        //释放资源
                        fis.close();
                        socket.close();

                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();

        }

        //server.close();
    }
}
