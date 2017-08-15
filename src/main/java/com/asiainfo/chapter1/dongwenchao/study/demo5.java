package com.asiainfo.chapter1.dongwenchao.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo5 {
    public static void main(String[]args){
        String a[]={"董稳超"};
        String b[]={"我就是我"};
        List list=new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object [] c=list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
