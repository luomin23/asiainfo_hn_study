package com.asiainfo.chapter1.zhangyang.week4_day_01_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by 11 on 2017/7/31.
 */
/*
数组列表类
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();//通过ArrayList实例化Collection
        List<String> list = new ArrayList<String>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        System.out.println("collection集合中的元素："+collection);
        list.add("A");
        list.add("C");
        list.add(1,"B");//向指定位置添加元素
        System.out.println("list集合中的元素："+list);
        list.addAll(0,collection);//向指定位置添加一个集合的所有元素
        System.out.println("list集合现有的元素："+list);
        List<String> subList = list.subList(2,5);//根据下标截取集合
        System.out.println("subList集合中的元素:"+subList);
        list.remove(3);//删除指定位置的元素
        list.remove("B");//删除指定的元素
        System.out.println("list集合现有的元素："+list);
        list.removeAll(collection);//删除整个集合的元素
        System.out.println("list集合现有的元素："+list);
    }
}
