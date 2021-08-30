package cn.itcaast.demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStreamCopy {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09\\a.txt");
        int len  = 0;
        while((len = fis.read()) != -1){
            System.out.println((char)len);
        }

        fis.close();
    }

}
