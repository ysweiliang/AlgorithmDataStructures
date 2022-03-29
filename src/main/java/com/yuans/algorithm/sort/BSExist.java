package com.yuans.algorithm.sort;

import com.yuans.algorithm.util.ArrayUtils;

import java.util.Arrays;

/**
 * 二分查找
 *
 * @author ys
 * @create 2022/3/29 15:00:53
 */
public class BSExist {

    /**
     * 数组中是否存在查找的值
     *
     * @param arr 待查数组
     * @param num 目标值
     * @return 是否存在，存在true，不存在false
     */
    public static boolean bsExist(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left < right) {
            mid = left + ((right - left) >> 1);
            if (arr[mid] > num) {
                right = mid - 1;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return arr[left] == num;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(50000, 100);
        Arrays.sort(arr);
        boolean b = bsExist(arr, 88);
        System.out.println(b);
    }
}
