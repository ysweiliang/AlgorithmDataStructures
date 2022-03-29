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

        int[] arr = generateRandomArray(100,200);
        selectSort2(arr);
        System.out.println(Arrays.toString(arr));
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

    public static void selectSort2(int[] arr) {
        //1.数据长度判断
        if (arr == null || arr.length < 2) {
            return;
        }
        //2.从0开始获取最小值下标,然后将最小值换到已排序数组最后面
        for (int i = 0; i < arr.length; i++) {// i ~ N-1 上找最小值的下标
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap2(arr, i, minIndex);
        }
    }

    private static void swap2(int[] arr, int i, int minIndex) {
        arr[i] = arr[i] ^ arr[minIndex];
        arr[minIndex] = arr[i] ^ arr[minIndex];
        arr[i] = arr[i] ^ arr[minIndex];
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        // Math.random()   [0,1)
        // Math.random() * N  [0,N)
        // (int)(Math.random() * N)  [0, N-1]
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }
}
