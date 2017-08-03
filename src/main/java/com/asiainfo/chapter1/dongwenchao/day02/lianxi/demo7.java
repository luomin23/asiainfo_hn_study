package com.asiainfo.chapter1.dongwenchao.day02.lianxi;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 超超 on 2017/7/30 0030.
 */
public class demo7 {
    public static void main(String [] args){
        int array[]=new int[10];
        Random a =new Random();
        for (int i=0;i<array.length;i++){
            array[i]=a.nextInt(100);
        }
        System.out.println("数组中的数据为："+ Arrays.toString(array));
        int max=array[0];
        for (int i=1;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("最大值是："+max);
    }
}
