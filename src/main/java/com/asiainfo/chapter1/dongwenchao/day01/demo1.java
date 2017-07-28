package com.asiainfo.chapter1.dongwenchao.day01;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class demo1 {
    public static void main(String[] args){
        int a[]={1,2,4,4,2,6,10,8,9,10,12,12};
        int b[]=new int[13];
        for (int i=0;i<a.length;i++)
            ++b[a[i]];
        System.out.printf("%s%10s\n","打分值","多少人");
        for (int j=1;j<b.length;j++)
            System.out.printf("%6d%10d\n",j,b[j]);
    }
}
