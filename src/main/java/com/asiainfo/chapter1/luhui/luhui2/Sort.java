package com.asiainfo.chapter1.luhui.luhui2;

/**
 * Created by 18237161432 on 2017/7/25.
 * 8、冒泡排序算法实现
 */
import java.util.*;
public class Sort {
    public static void main(String[] args){
        int temp;
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            int number=new Random().nextInt(100);
            arr[i]=number;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("——冒泡排序开始———");
        for (int i=0;i<arr.length-1;i++){
            for (int y=0;y<arr.length-i-1;y++){
                if(arr[y]>arr[y+1]){
                    temp=arr[y+1];
                    arr[y+1]=arr[y];
                    arr[y]=temp;
                }
            }
            for (int a=0;a<arr.length;a++){
                System.out.print(arr[a]+"\t");
            }
            System.out.println("");
        }
        System.out.println("——冒泡排序结束——");
        System.out.println(Arrays.toString(arr));
    }

}
