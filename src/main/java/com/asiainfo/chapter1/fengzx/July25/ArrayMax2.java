package com.asiainfo.chapter1.fengzx.July25;

import java.util.Arrays;

/**
 * Created by fengzx on 2017/7/25.
 */
public class ArrayMax2 {
    public static void main(String[] args){
        int[] array = new int[10];
        int i;
        for (i=0; i<10; i++){
            array[i]=(int)(Math.random()*100);
        }
        System.out.println("数组中的数据为："+ Arrays.toString(array));

        int[] arr = new int[11];
        System.arraycopy(array,0,arr,0,10);
        Arrays.sort(array);
        System.out.println("最大值为："+array[9]);
        int max=array[9];
        arr[10]=max;
        System.out.print("新数组的数据为："+Arrays.toString(arr));
    }
}
