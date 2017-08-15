package com.asiainfo.chapter1.dongwenchao.day07;

import java.util.*;

/**
 * Created by 超超 on 2017/8/2 0002.
 */
public class demo6 {
    /*public static void main(String[] args) {
       *//* String[] books = {
                "董稳超",
                "wojiushiwo"
        };
        *//**//*System.out.print(books);*//**//*
        List bookList = new ArrayList();
        for (int i = 0; i < books.length; i++) {
            bookList.add(books[i]);
        }
            ListIterator lit=bookList.listIterator();
            while (lit.hasNext()){
                System.out.println(lit.next());
                lit.add("-------分隔符-------");
            }
            System.out.println("==========下面开始反向迭代===========");
            while(lit.hasPrevious())
            {
                System.out.println(lit.previous());
            }*//*
        }*/
    int age;
    public demo6(int age){
        this.age=age;
    }
    public String toString(){
        return "M对象（age：" + age + ")";
    }
}
 class TestTreeSet3 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
                demo6 m1 = (demo6) o1;
                demo6 m2 = (demo6) o2;
                if (m1.age>m2.age){
                    return -1;
                }else if (m1.age == m2.age) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        ts.add(new demo6(5));
        ts.add(new demo6(-3));
        ts.add(new demo6(9));
        System.out.println(ts);
    }
}
