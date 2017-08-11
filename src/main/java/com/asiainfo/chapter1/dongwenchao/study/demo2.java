package com.asiainfo.chapter1.dongwenchao.study;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 超超 on 2017/8/2 0002.
 */
public class demo2 {
    public static void main(String []args){
        int array[]=new int[6];
        Arrays.fill(array,100);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array,3,6,50);
        for (int i=0,n=array.length;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
