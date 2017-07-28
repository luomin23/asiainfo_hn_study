package com.asiainfo.chapter1.luhui.luhui2;

/**
 * Created by 18237161432 on 2017/7/25.
 * 7、求数组元素的最大值放在最后一位
 */
import java.util.*;
public class LastArray {
    public static void main(String[] args) {
        int[] ar= new int[11];
        int[] arr = new int[10];
       int max=0;
        System.out.print("数组中的数据为：{");
        for (int i = 0; i < arr.length; i++) {
            int number = new Random().nextInt(100);
            arr[i] = number;
           if (arr[i]>max){
                max=arr[i];
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println("}");
        ar[10]=max;
        System.arraycopy(arr,0,ar,0,arr.length);
        for (int str:ar){
            System.out.print(str+",");
        }


}}
