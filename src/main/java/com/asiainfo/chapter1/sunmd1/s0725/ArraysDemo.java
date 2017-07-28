package com.asiainfo.chapter1.sunmd1.s0725;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class ArraysDemo {
    public static void main(String[] args){
        int[] arr = {22,1,34,53,67,49,0,39,13,79};
        //排序前
        System.out.println("数组中的数据为："+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("最大值为："+arr[arr.length-1]);
    }
}
