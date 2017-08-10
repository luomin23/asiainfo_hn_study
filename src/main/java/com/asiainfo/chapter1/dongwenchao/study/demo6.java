package com.asiainfo.chapter1.dongwenchao.study;

import java.util.Arrays;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo6 {
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        int b[]={5,0,1,30,2};
        int c[]={1,2,3,4,5};
        System.out.println("数组是否相等："+ Arrays.equals(a,b));
        System.out.println("数组是否相等："+ Arrays.equals(a,c));
    }
}
