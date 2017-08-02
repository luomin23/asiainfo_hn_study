package com.asiainfo.chapter1.zhangyang.week4_day_01_collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by 11 on 2017/7/31.
 */
public class IteratorDemo01 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.add("4");
        link.add("5");
        Iterator<String> iterator = link.iterator();//实例化接口
       // while (iterator.hasNext()) {
            //System.out.print(iterator.next()+" ");
       // }//输出集合所有的元素
        while (iterator.hasNext()) {
            String str = iterator.next();//取得元素
            if (str.equals("3") || str.equals("4")) {
                iterator.remove();//删除集合指定的元素
            } else {
                System.out.print(str + " ");
            }
        }
    }
}
