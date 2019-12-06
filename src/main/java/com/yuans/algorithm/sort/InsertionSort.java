package com.yuans.algorithm.sort;

/**
 * 插入排序
 *
 * @author yuans
 * @create 2019-12-06-23:28
 */
public class InsertionSort {

    // 插入排序，a表示数组，n表示数组大小
    public void insertionSort(int[] a, int n) {
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

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] a = new int[]{1, 3, 2, 6, 5, 9, 7};
        is.insertionSort(a, a.length);
        for (int x : a) {
            System.out.print(x);
        }
    }
}
