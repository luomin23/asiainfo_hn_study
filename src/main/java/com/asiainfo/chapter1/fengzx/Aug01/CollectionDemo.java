package com.asiainfo.chapter1.fengzx.Aug01;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by fengzx on 2017/8/1.
 */
public class CollectionDemo {
    public static void main(String[] args){
        Collection c= new ArrayList();

        System.out.println("add:"+c.add("hello"));
        c.add("hello");
        c.add("world");
        c.add("java");

        //c.clear();

        //System.out.println("remove:"+c.remove("world"));
        System.out.println("remove:"+c.remove("javaee"));

        System.out.println("contains:"+c.contains("world"));
        System.out.println("contains:"+c.contains("javaee"));

        System.out.println("isEmpty:"+c.isEmpty());

        System.out.println("size:"+c.size());

        System.out.println("c:"+c);
    }
}
