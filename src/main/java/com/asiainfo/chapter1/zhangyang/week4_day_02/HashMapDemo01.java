package com.asiainfo.chapter1.zhangyang.week4_day_02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 11 on 2017/8/1.
 */
public class HashMapDemo01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"中原工学院");
        map.put(2,"郑州大学");
        map.put(3,"清华大学");
        map.put(4,"北京大学");
        map.put(1,"复旦大学");
        System.out.println("获取内容："+map.get(1));
    }
}
