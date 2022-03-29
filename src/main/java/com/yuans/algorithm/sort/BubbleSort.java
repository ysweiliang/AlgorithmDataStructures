package com.yuans.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author yuans
 * @create 2019-12-06-23:27
 */
public class BubbleSort {

    // 冒泡排序，a表示数组，n表示数组大小
    public static void bubbleSort(int[] arr, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) { // 交换
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //最后位置往前推
        for (int end = arr.length - 1; end > 0; end--) {
            //i < end----(a[i + 1])
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr) {
        //1.每次将最大值放到最后
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2, 6, 5, 9, 7};
//        BubbleSort.bubbleSort(a, a.length);
//        BubbleSort.bubbleSort(a);
        BubbleSort.bubbleSort2(a);
        System.out.print(Arrays.toString(a));
    }
}
