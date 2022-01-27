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
    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }

    public static void bubbleSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        for (int end = a.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2, 6, 5, 9, 7};
//        BubbleSort.bubbleSort(a, a.length);
        BubbleSort.bubbleSort(a);
        System.out.print(Arrays.toString(a));
    }
}
