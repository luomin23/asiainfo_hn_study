package com.asiainfo.chapter1.dongwenchao.study;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class demo4 {
    public static void main(String [] args){
        int a[]=new int[6];
        Random b=new Random();
        for (int i=0;i<a.length;i++){
            a[i]=b.nextInt(50);
        }
        System.out.println(Arrays.toString(a)+"\n");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        /*printArray("排序后的数组为："+a);*/

    }
}