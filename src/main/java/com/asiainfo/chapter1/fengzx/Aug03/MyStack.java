package com.asiainfo.chapter1.fengzx.Aug03;

import java.lang.Object;

import java.util.LinkedList;

/**
 * Created by fengzx on 2017/8/3.
 */
public class MyStack {
    private LinkedList link;

    public MyStack(){
        link = new LinkedList();
    }

    public void add(Object obj){
        link.addFirst(obj);
    }

    public Object get(){
        return link.removeFirst();
    }

    public boolean isEmpty(){
        return link.isEmpty();
    }
}
