package com.asiainfo.chapter1.zhangyang.week4_day_01_collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by 11 on 2017/7/31.
 */
public class ThreeSetDemo01 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(5);
        set.add(9);
        set.add(2);
        set.add(8);
        set.add(1);//重复的元素加不进去
        set.add(2);
        System.out.println(set);
    }
}
