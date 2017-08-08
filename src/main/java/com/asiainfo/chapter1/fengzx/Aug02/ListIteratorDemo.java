package com.asiainfo.chapter1.fengzx.Aug02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by fengzx on 2017/8/2.
 */
public class ListIteratorDemo {
    public static void main(String[] args){
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        list.add(1,"javaee");

        System.out.println("get:"+list.get(1));

        //System.out.println("remove:"+list.remove(1));

        System.out.println("set:"+list.set(1,"j2ee"));

        Iterator it = list.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }

        System.out.println("-----------");

        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            String s = (String)lit.next();
            System.out.println(s);
        }

        System.out.println("-----------");

//      先正向遍历才可以逆向遍历
        while (lit.hasPrevious()){
            String s = (String)lit.previous();
            System.out.println(s);
        }
    }
}
