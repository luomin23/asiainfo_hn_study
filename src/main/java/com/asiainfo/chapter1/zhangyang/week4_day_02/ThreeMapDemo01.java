package com.asiainfo.chapter1.zhangyang.week4_day_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by 11 on 2017/8/1.
 */
public class ThreeMapDemo01 {
    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<Integer, String>();
        hashmap.put(5,"中原工学院");
        hashmap.put(1,"郑州大学");
        hashmap.put(4,"清华大学");
        hashmap.put(2,"北京大学");
        hashmap.put(3,"复旦大学");
        Set<Map.Entry<Integer,String>> set = hashmap.entrySet();
        Iterator<Map.Entry<Integer,String>> ientry = set.iterator();
        System.out.println("****使用threemap输出****");
        while (ientry.hasNext()){
            Map.Entry<Integer,String> threeenty = ientry.next();
            System.out.println(threeenty.getKey()+"----"+threeenty.getValue());
        }
    }
}
