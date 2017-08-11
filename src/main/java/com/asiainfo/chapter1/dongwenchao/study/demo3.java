package com.asiainfo.chapter1.dongwenchao.study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class demo3 {
    public static void main(String []args){
        Integer a[]= new Integer[10];
        Integer b[]= new Integer[11];
        Random c=new Random();
        for (int i=0;i<a.length;i++){
            a[i]=c.nextInt(100);
        }
        /*Integer [] number={5,8,2,9,6,0,12,15};*/
        System.out.println("这个随机数组为："+Arrays.toString(a));
        int max=Collections.max(Arrays.asList(a));
        System.out.println("最大值: " + max);
        b[10]=max;
        System.arraycopy(a,0,b,0,a.length);
        System.out.println("新数组中的数据为："+ Arrays.toString(b));
    }
}
