package cn.itcast.demo03Upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    文件上传案例服务器端：读取客户端上传的文件，保存到服务器的硬盘，给客户端回写“上传成功”

    明确：
        数据源：客户端上传的文件
        目的地：服务器的硬盘E:\\upload\\1.jpg

    实现步骤：
        1：创建一个服务器ServerSocket对象，和系统指定的端口号
        2：使用ServerSocket对象中的方法accept，获取到请求的客户端Socket对象
        3：使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
        4：判断e:\\upload文件夹是否存在，不存在则创建
        5：创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
        6：使用字节输入流INputStream对象中的方法read，读取客户端上传的文件
        7：使用本地字节输出流FileOutputStream对象中的方法write，把读取到的文件保存到服务器的硬盘里
        8：使用Socket对象中的方法getOutputStream，获取到网络字节输出流OutputStream对象
        9：使用网络字节输出流OutputStream对象的方法write，给客户端回写“上传成功”
        10：释放资源（FileoutputStream，Socket，ServerSocket）
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1：创建一个服务器ServerSocket对象，和系统指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //2：使用ServerSocket对象中的方法accept，获取到请求的客户端Socket对象
        /*
       让服务器一直处于监听状态（死循环accept）
       有一个客户端上传文件，就保存一个文件
         */

        while (true) {
            Socket socket = server.accept();
            /*
            使用多线程技术提高程序的效率
            有一个客户端上传文件，就开启一个线程，完成文件的上传
             */

            new Thread(new Runnable() {
                //重写run完成文件的上传
                @Override
                public void run() {
                    try {
                        //3：使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //4：判断e:\\upload文件夹是否存在，不存在则创建
                        File f = new File("e:\\upload");
                        if (!f.exists()) {
                            f.mkdirs();
                        }

        /*
        自定义一个文件的命名规则：防止同名的文件被覆盖
        规则：域名+毫秒值+随机数

         */
                        String filename = "itcast" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";
                        //5：创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
                        FileOutputStream fos = new FileOutputStream(f + "\\" + filename);
                        //6：使用字节输入流INputStream对象中的方法read，读取客户端上传的文件
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {

                            //7：使用本地字节输出流FileOutputStream对象中的方法write，把读取到的文件保存到服务器的硬盘里
                            fos.write(bytes, 0, len);
                        }

                        //8：使用Socket对象中的方法getOutputStream，获取到网络字节输出流OutputStream对象
                        OutputStream os = socket.getOutputStream();
                        //9：使用网络字节输出流OutputStream对象的方法write，给客户端回写“上传成功”
                        os.write("上传成功".getBytes());
                        //10：释放资源（FileoutputStream，Socket，ServerSocket）
                        fos.close();
                        socket.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }).start();


        }
        //服务器不用关闭
        //server.close();
    }
}
