package cn.itcast.demo05System;

import java.util.Arrays;

/*
- `public static long currentTimeMillis()`：
返回以毫秒为单位的当前时间。
- `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：
将数组中指定的数据拷贝到另一个数组中。

 */
public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }
    /*

    `public static void arraycopy
    (Object src, int srcPos, Object dest, int destPos, int length)`：
    将数组中指定的数据拷贝到另一个数组中。
src - 源数组。
srcPos - 源数组中的起始位置。（起始索引）
dest - 目标数组。
destPos - 目标数据中的起始位置。
length - 要复制的数组元素的数量。
将src数组中前3个元素，复制到dest数组的前3个位置上
复制元素前：
src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
复制元素后：
src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
     */

    private static void demo02() {
        //定义原数组
        int[] src = {1,2,3,4,5};
        //定义目标数组
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前" + Arrays.toString(dest));
        //使用System的arraycopy将src数组中前3个元素，复制到dest数组的前3个位置上
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后" + Arrays.toString(dest));
    }

    /*
    `public static long currentTimeMillis()`：
    返回以毫秒为单位的当前时间。
    用来测试时间效率
    验证用for
     */
    private static void demo01() {
        //程序执行前获取毫秒值
        long s = System.currentTimeMillis();
        //执行for
        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }
        //执行后获取毫秒值
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时：" + (e - s) + "毫秒" );

    }

}
