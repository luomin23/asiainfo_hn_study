package com.asiainfo.chapter1.dongwenchao.day06;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 超超 on 2017/8/1 0001.
 */
public class demo9 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("11111");
        set.add("22222");
        set.add("33333");
        set.add("44444");
        set.add("22222");
        System.out.println(set.size());
        for (String e : set) {
            System.out.println(e);
        }
    }
}
