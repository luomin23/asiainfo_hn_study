package com.asiainfo.chapter1.zhangle.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by del on 2017/7/25.
 */
public class BubbleSort {

    public static void main(String[] args) {
        Random r=new Random();
        int[] arr=new int[10];
        int i=0;
        for(;i<arr.length;i++){
            arr[i]=r.nextInt(99);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("---------冒泡排序开始----------");
        for(int x=0;x<arr.length-1;x++){
            for(int y=0;y<arr.length-1-x;y++){
                int tmp=arr[y];
                if(arr[y]>arr[y+1]){
                    arr[y]=arr[y+1];
                    arr[y+1]=tmp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("---------冒泡排序结束----------");
        System.out.println(Arrays.toString(arr));

    }
}
