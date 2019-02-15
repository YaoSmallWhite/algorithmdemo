package com.yao.algorithmdemo.sort;

import com.yao.algorithmdemo.util.ArrayUtil;

import java.util.Arrays;

/**
 * @Description: 冒泡排序
 * @Author: ys1892
 * @Date: 2019-02-15
 * @Time: 10:12
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,1,3,5,7,4,9,8,6};
        int[] a = sort(arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                //如果arr[j]>arr[j+1] 则交换位置
               if(arr[j]>arr[j+1]){
                   ArrayUtil.swapPositin(arr,j,j+1);
               }
            }
        }
        return arr;
    }
}
