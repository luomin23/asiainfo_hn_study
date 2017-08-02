package com.asiainfo.chapter1.fengzx.July25;

import java.util.Arrays;

/**
 * Created by fengzx on 2017/7/25.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] array = new int[10];
        int i,j,temp;
        for (i=0; i<10; i++){
            array[i]=(int)(Math.random()*100);
        }
        System.out.println( Arrays.toString(array));
        System.out.println("-------------冒泡排序开始-------------");
        for (i=0;i<array.length-1;i++){
            for (j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            System.out.println( Arrays.toString(array));
        }
        System.out.println("-------------冒泡排序结束-------------");
        System.out.println( Arrays.toString(array));
    }
}
