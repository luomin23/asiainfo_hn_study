package com.asiainfo.chapter1.dongwenchao.day11;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by 超超 on 2017/8/6 0006.
 */
public class demo2 {
        public static void main(String[] args) throws Exception {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Method method = list.getClass().getMethod("add", Object.class);
            method.invoke(list, "Java反射机制实例。");
            System.out.println(list.get(0));

    }
}
