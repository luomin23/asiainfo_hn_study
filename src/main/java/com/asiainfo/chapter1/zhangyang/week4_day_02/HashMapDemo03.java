package com.asiainfo.chapter1.zhangyang.week4_day_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by 11 on 2017/8/1.
 */
/*
使用迭代器输出map集合
 */
public class HashMapDemo03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"中原工学院");
        map.put(2,"郑州大学");
        map.put(3,"清华大学");
        map.put(4,"北京大学");
        map.put(5,"复旦大学");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //将map集合想转换为Set集合
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        System.out.println("key-----value");
        while (iterator.hasNext()){
            Map.Entry<Integer,String> mentery = iterator.next();
            System.out.println(""+mentery.getKey()+"-----"+mentery.getValue());
        }
    }
}
