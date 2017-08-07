package com.asiainfo.chapter1.luomin.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Luoo
 * @create 2017-08-01 9:50
 */

public class CollectionsExercises {

    public static void replaceAllExs() {
        List<String> list = new ArrayList<String>();
        list.add("hello1");
        list.add("world");
        list.add("hello2");


        Collections.replaceAll(list, "hello", "god");

        Collections.reverse(list);


        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            System.out.println(next);
            if("world".equals(next)) list.remove(3);

            
        }

        System.out.println("-----------------");
        for (int i = 0; i < list.size(); i++) {
            String cur = list.get(i);
            System.out.println(cur);
        }
    }

    public static void main(String[] args) {
        CollectionsExercises.replaceAllExs();
    }
}
