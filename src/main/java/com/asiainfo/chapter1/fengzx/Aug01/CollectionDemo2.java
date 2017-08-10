package com.asiainfo.chapter1.fengzx.Aug01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by fengzx on 2017/8/1.
 */
public class CollectionDemo2 {
    public static void main(String[] args){
        Collection c1 = new ArrayList();
        c1.add("abc");
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");

        Collection c2 = new ArrayList();
        //c2.add("abc");
        c2.add("abc4");
        c2.add("abc5");

        //c1.addAll(c2);

        //System.out.println("removeAll:"+c1.removeAll(c2));

        //System.out.println("containsAll:"+c1.containsAll(c2));

        System.out.println("retainAll:"+c1.retainAll(c2));

        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
    }
}
