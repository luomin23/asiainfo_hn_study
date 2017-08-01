package com.asiainfo.chapter1.zhangyang.week4_day_01_collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by 11 on 2017/7/31.
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        Iterator<String> iterator = link.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        Collections.reverse(link);
        System.out.println("\n集合进行反序输出：");
        for (String str:link) {
            System.out.print(str+" ");
        }
        System.out.println("\n集合最大值："+Collections.max(link));
        System.out.println("集合最小值："+Collections.min(link));
    }
}
