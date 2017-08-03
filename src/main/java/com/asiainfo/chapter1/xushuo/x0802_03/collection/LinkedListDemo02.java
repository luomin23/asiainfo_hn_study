package com.asiainfo.chapter1.xushuo.x0802_03.collection;

import java.util.LinkedList;

/**
 * Created by root on 2017/8/2.
 * LinkedList
 */
public class LinkedListDemo02 {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.addFirst("B");
        link.addLast("E");
        LinkedList<String> newLink=new LinkedList<String>(link);
        System.out.println("添加元素后：\n\t"+link);
        System.out.println("get()方法获取表头："+link.getFirst());
        System.out.println("使用get()方法后：\n\t"+link);
        System.out.println("element()方法获取表头："+link.element());
        System.out.println("使用element()方法后：\n\t"+link);
        System.out.println("peek()方法获取表头："+link.peek());
        System.out.println("使用peek()方法后：\n\t"+link);
        System.out.println("poll()方法获取表头："+link.poll());
        System.out.println("使用poll()方法后：\n\t"+link);
        System.out.println("pop()方法获取表头：" + link.pop());
        System.out.println("使用pop()方法后：\n\t"+link);
        System.out.println("****使用链表的先进先出****");
        int len = newLink.size();
        for (int i=0;i<len;i++) {
            System.out.print(newLink.poll()+" ");
        }
        System.out.println();
    }
}
