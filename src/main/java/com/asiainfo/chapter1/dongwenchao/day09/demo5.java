package com.asiainfo.chapter1.dongwenchao.day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class demo5 {
    public static void main(String []args){
        List<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(5);
        Iterator<Integer> it=a.iterator();
        while (it.hasNext()){
            int num=it.next();
            if (num==5){
                it.remove();
                continue;
            }
            System.out.println(num);
        }
    }
}
