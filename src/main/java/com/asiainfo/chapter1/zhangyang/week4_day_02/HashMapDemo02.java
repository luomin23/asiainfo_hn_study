package com.asiainfo.chapter1.zhangyang.week4_day_02;

import java.util.*;

/**
 * Created by 11 on 2017/8/1.
 */
/*
Map集合输出所有的key和value
 */
public class HashMapDemo02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"中原工学院");
        map.put(2,"郑州大学");
        map.put(3,"清华大学");
        map.put(4,"北京大学");
        map.put(5,"复旦大学");
        Set<Integer> set = map.keySet();//将map集合的key转为set集合
        Iterator<Integer> ikey = set.iterator();//set集合实例化迭代器
        System.out.println("Map集合中所有的key：");
        while (ikey.hasNext()){
            System.out.print(ikey.next()+" ");
        }
        Collection<String> collection = map.values();//将map集合中的values转为collection集合
        Iterator<String> icoll = collection.iterator();
        System.out.println("\nMap集合中所有的values");
        while (icoll.hasNext()){
            System.out.print(icoll.next()+" ");
        }
    }
}
