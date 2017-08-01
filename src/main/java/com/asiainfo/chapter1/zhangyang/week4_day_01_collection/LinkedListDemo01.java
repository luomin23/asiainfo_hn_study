package com.asiainfo.chapter1.zhangyang.week4_day_01_collection;

import java.util.LinkedList;

/**
 * Created by 11 on 2017/7/31.
 */
/*
使用getFirst()、element()、peek()、poll()和pop()方法均可以获取链表头
但是poll和pop方法获取表头后会将其删除。
 */
public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.addFirst("F");//在链表头部添加元素
        link.addLast("L");//在链表尾部添加元素
        System.out.println("添加元素后"+link);
        System.out.println("使用get方法获取链表头："+link.getFirst());
        System.out.println("使用get方法后"+link);
        System.out.println("使用poll方法获取链表头："+link.poll());
        System.out.println("使用poll方法获取后"+link);
    }
}
