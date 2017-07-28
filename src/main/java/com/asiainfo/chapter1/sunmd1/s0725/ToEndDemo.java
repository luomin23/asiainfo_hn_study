package com.asiainfo.chapter1.sunmd1.s0725;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class ToEndDemo {
    public static void main(String[] args){
        int[] arr1 = {22,1,34,53,67,49,0,99,13,79};
        //排序前
        System.out.println("数组中的数据为："+ Arrays.toString(arr1));
        int[] arr2 = new int[11];
        for(int i=0;i<10;i++){
            arr2[i] = arr1[i];
        }
        Arrays.sort(arr1);
        System.out.println("最大值为："+arr1[arr1.length-1]);
        arr2[10] = arr1[arr1.length-1];
        System.out.println("新数组中的数据为："+Arrays.toString(arr2));
    }

}
