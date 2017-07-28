package com.asiainfo.chapter1.zhangle.day3;

/**
 * Created by del on 2017/7/26.
 */
public class NumsOut {
    public static void main(String[] args) {
       for(Nums n:Nums.values()){
           System.out.println(n+"： name:"+n.getName()+" index:"+n.getIndex());
       }

    }
}
