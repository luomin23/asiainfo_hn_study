package com.asiainfo.chapter1.dongwenchao.day02.lianxi;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 超超 on 2017/8/1 0001.
 */
public class demo9 {
    public static void main(String [] args){
        int array[]=new int[10];
        Random a=new Random();
        for (int i=0;i<array.length;i++) {
            array[i]=a.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("------------冒泡排序开始-------------");
        for (int i=1;i<10;i++){
            for (int j=0;j<10-i;j++){
                if (array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("  - - - - 冒泡排序开始- - - - - - -");
        System.out.println(Arrays.toString(array));
    }
}
