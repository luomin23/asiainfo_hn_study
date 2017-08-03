package com.asiainfo.chapter1.dongwenchao.day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 超超 on 2017/8/1 0001.
 */
public class demo1 {
    public static void main(String[] args){
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("123");
        //第一种遍历方法使用foreach遍历List
        for (String str:list){
            System.out.println(str);
        }
        System.out.println();
        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++) //这里也可以改写为  foreach(String str:strArray)这种形式
        {
            System.out.println(strArray[i]);
        }
        Iterator<String> a=list.iterator();
        while (a.hasNext()){
            System.out.println(a.next());
        }
    }
}
