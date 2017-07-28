package com.asiainfo.chapter1.sunmd1.s0725;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class MaoPDemo {
    public static void main(String[] args){
        int[] arr = {22,1,34,53,67,49,0,99,13,79};
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------冒泡排序开始-----------");
        for (int i=0;i<10;i++){
            for (int j=0;j<9;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("---------------冒泡排序结束-----------");
        System.out.println(Arrays.toString(arr));
    }

}
