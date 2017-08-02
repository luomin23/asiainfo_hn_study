package com.asiainfo.chapter1.wangjz.java.javaday1.javaday7;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by wjz123456 on 2017/8/2.
 */
public class Stackdemo {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push(1);
        s.push(2);
        s.push(3);
        Iterator<Object> i= s.iterator();//迭代器方式遍历Stack
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(s.search("B"));//返回指定元素的索引
        System.out.println(s.contains("C"));//集合中是否包含指定的元素
        System.out.println(s.hashCode());//返回哈希值
        System.out.println(s.size());
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s.empty());//判断是否为空
    }
}
