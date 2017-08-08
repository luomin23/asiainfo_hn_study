package com.asiainfo.chapter1.fengzx.Aug02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by fengzx on 2017/8/2.
 */
public class ListIteratorDemo2 {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            String s = (String)it.next();
//            if ("lisi".equals(s)){
//                list.add("zhaoliu");
//            }
//        }

//        for (int x = 0;x<list.size();x++){
//            String s = (String)list.get(x);
//            if ("lisi".equals(s)){
//                list.add("zhaoliu");
//            }
//        }

        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            String s = (String)lit.next();
            if ("lisi".equals(s)){
                lit.add("zhaoliu");
            }
        }

        System.out.println("list:"+list);
    }
}
