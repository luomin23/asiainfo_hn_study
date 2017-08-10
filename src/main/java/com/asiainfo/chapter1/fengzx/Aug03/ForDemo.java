package com.asiainfo.chapter1.fengzx.Aug03;

import java.util.ArrayList;

/**
 * Created by fengzx on 2017/8/3.
 */
public class ForDemo {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
//      普通for循环
        for (int x= 0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
        System.out.println("------");
//      增强for循环
        for (int x : arr){
            System.out.println(x);
        }
        System.out.println("------");

        String[] strarr = {"hello","world","java"};

        for (String str : strarr){
            System.out.println(str);
        }
        System.out.println("------");

        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        for (String str : array){
            System.out.println(str);
        }
    }
}
