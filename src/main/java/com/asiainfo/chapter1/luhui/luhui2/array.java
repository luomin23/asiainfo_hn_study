package com.asiainfo.chapter1.luhui.luhui2;

import java.util.Random;

/**
 * Created by 18237161432 on 2017/7/25.
 * 6、求数组元素的最大值
 */

import java.util.*;
public class array {
    public static void main(String[] args){
        int max=0;
        int[] arr=new int[10];
        System.out.print("数组中的数据为：{");
        for(int i=0;i<arr.length;i++){
            int number=new Random().nextInt(100);
            arr[i]=number;
            if (arr[i]>max){
                max=arr[i];
            }
            System.out.print(arr[i]+",");
        }
        System.out.println("}");
        System.out.println(max);
    }

}
