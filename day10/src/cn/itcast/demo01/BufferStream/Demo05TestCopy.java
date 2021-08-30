package cn.itcast.demo01.BufferStream;

import java.io.*;
import java.util.HashMap;

public class Demo05TestCopy {
    public static void main(String[] args) throws IOException {

        HashMap<String,String> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("day10\\in.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\outt.txt"));

        String line;
        while((line = br.readLine()) != null){

            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);

        }
        for (String key : map.keySet()) {
            String  value = map.get(key);
            line = key + "." + value;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
