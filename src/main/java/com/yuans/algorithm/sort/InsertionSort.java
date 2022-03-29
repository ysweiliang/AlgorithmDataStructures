package com.yuans.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author yuans
 * @create 2019-12-06-23:28
 */
public class InsertionSort {

    // 插入排序，a表示数组，n表示数组大小
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j + 1] = value; // 插入数据
        }
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
            //将最小值放到最前面
            //j = i - 1 : 当前值前一位，如果j>0同时前面的值大于当前值，则进行数值调换，
            //直到将当前值放到第一位或者当前值大于前一位停止（已排序好的数组有序）
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2, 6, 5, 9, 7};
//        InsertionSort.insertionSort(a, a.length);
        InsertionSort.insertionSort(a);
        System.out.print(Arrays.toString(a));
    }
}
