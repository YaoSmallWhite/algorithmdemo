package com.yao.algorithmdemo.sort;

import com.yao.algorithmdemo.util.ArrayUtil;

import java.util.Arrays;

/**
 * @Description: 选择排序
 * @Author: ys1892
 * @Date: 2019-02-15
 * @Time: 10:48
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr={2,1,3,5,7,4,9,8,6};
        int[] a = sort(arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    ArrayUtil.swapPositin(arr,i,j);
                }
            }
        }
        return arr;
    }
}
