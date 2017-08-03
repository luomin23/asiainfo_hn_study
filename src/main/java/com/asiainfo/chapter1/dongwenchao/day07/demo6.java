package com.asiainfo.chapter1.dongwenchao.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 超超 on 2017/8/2 0002.
 */
public class demo6 {
    public static void main(String[] args) {
        String[] books = {
                "董稳超",
                "wojiushiwo"
        };
        /*System.out.print(books);*/
        List bookList = new ArrayList();
        for (int i = 0; i < books.length; i++) {
            bookList.add(books[i]);
            System.out.println(books);
            ListIterator lit=bookList.listIterator();
            while (lit.hasNext()){
                System.out.println(lit.next());
                lit.add("-------分隔符-------");
            }
        }
    }
}