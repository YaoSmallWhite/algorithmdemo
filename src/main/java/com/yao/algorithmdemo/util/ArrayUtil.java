package com.yao.algorithmdemo.util;

/**
 * @Description: 数组常用工具
 * @Author: ys1892
 * @Date: 2019-02-15
 * @Time: 10:16
 */
public class ArrayUtil {
    /**
     * 交换数组两个元素的位置
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swapPositin(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
