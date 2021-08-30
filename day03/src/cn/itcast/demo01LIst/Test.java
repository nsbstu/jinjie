package cn.itcast.demo01LIst;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(0,"a");
        l.add(0,"b");
        l.add(2,"c");
        l.add(3,"d");
        System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals("b")) {
                l.add("ee");
            }
        }
        System.out.println(l);
    }
}
