package com.yuans.algorithm.base;

/**
 * 位运算
 *
 * @author ys
 * @create 2022/1/20 11:24:58
 */
public class BitOperation {

    public static void main(String[] args) {
        int num = 4;
        print(num);
        print(num << 3);
        System.out.println(1 & 3);
    }

    /**
     * @param num 数字
     */
    public static void print(int num) {
        for (int i = 31; i > 0; i--) {
            //i为下标位数，0&0=0;0&1=0;1&0=0;1&1=1;
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
