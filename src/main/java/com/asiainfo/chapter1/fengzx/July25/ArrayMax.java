package com.asiainfo.chapter1.fengzx.July25;

import java.util.Arrays;

/**
 * Created by fengzx on 2017/7/25.
 */
public class ArrayMax {
    public static void main(String[] args){
        int[] array = new int[10];
        int i;
        for (i=0; i<10; i++){
            array[i]=(int)(Math.random()*100);
        }
        System.out.println("数组中的数据为："+ Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("最大值为："+array[9]);
    }
}
