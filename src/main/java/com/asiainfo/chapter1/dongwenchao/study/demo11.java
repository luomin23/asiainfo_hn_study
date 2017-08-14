package com.asiainfo.chapter1.dongwenchao.study;

import java.util.Iterator;

/**
 * Created by 超超 on 2017/8/11 0011.
 */
public class demo11 {
    public static void main(String[] args) {
        String a[]=new String[]{"A","B","C"};
        String[] b=new String[5];
        b[3]="C";
        b[4]="D";
        System.arraycopy(a,1,b,0,a.length-1);//复制数组a的长度到数组b中
        for (String str:b){//    用的是迭代的循环，判断b数组中是否还有值。
            System.out.println(str);
        }
    }
}
