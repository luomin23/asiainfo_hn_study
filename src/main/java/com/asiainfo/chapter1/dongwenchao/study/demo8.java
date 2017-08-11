package com.asiainfo.chapter1.dongwenchao.study;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by 超超 on 2017/8/9 0009.
 */
public class demo8 {
    public static void main(String []args){
        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
        a.add("dong");
        a.add("wen");
        b.add("chao");
        b.add("wo");
        System.out.println("数组a的元素为"+a);
        System.out.println("数组b的元素为"+b);
        System.out.println("a 是否包含字符串wen? ： "+"\n"+
        a.contains("wen"));
    }
}
