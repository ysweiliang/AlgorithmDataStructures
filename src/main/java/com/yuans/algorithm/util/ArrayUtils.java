package com.yuans.algorithm.util;

/**
 * 数组相关工具
 *
 * @author ys
 * @create 2022/3/29 15:32:39
 */
public class ArrayUtils {

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }
}
