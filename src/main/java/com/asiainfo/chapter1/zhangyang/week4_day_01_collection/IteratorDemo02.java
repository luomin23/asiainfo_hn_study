package com.asiainfo.chapter1.zhangyang.week4_day_01_collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by 11 on 2017/7/31.
 */
public class IteratorDemo02 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.add("4");
        link.add("5");
        for (String str :link){
            System.out.print(str+" ");
        }//使用foreach循环输出集合元素
        System.out.println("\n元素数目："+link.size());
        Iterator<String> iterator = link.iterator();
        while (iterator.hasNext()){
            iterator.next();//指定删除的元素，不指定会报异常
            iterator.remove();
        }
        System.out.println("元素数目："+link.size());
    }
}
