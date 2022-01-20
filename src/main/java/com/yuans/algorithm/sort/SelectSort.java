package com.yuans.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author ys
 * @create 2022/1/20 14:18:02
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2, 6, 5, 9, 7};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 以当前index为最小索引，往后遍历，找到最小的数的索引下标，然后交换数据
     *
     * @param arr 数组
     */
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
