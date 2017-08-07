package com.asiainfo.chapter1.xushuo.x0802_03.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by root on 2017/8/3.
 * 向集合添加元素并执行反序操作
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();               //通过ArrayList实例化List
        list.add("A");
        list.add("B");
        Collections.addAll(list,"1","2","3");                      //通过Collections添加元素
        Iterator<String> it1 = list.iterator();                    //实例化Iterator
        System.out.println("输出集合中的元素");
        while (it1.hasNext())                                      //判断是否还存在元素
        {
            System.out.println(it1.next()+" ");                    //输出元素
        }
        Collections.reverse(list);                                 //反转集合中的元素顺序
        System.out.println("\n对集合进行反序输出：");
        Iterator<String> it2 = list.iterator();                    //实例化Iteerator
        while (it2.hasNext())                                      //判断是否还存在元素
        {
            System.out.print(it2.next()+" ");
        }
    }
}
