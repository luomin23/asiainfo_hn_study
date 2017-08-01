package com.asiainfo.chapter1.zhangle.August1st;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by del on 2017/8/1.
 */
public class ListJava {

    /*List 接口的输出
    * 特点：有序 元素可重复
    * ArrayList LinkedList 是List的实现类
    * */
    public static void printList(List list){
        for(Object o:list){
            String s=(String)o;
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static void list(List list){
        list.add("I");
        list.add("am");
        list.add("one");
        /*在one前面插入the firs*/
        list.add(2,"the");
        list.add(3,"first");
        list.add(3,"first");//先输出最后的first再输出上一步的first
        list.add(2,"");
        /*删除指定元素*/
        list.remove("first");
        System.out.println("输出List的元素：");
        printList(list);

    }

    public static void main(String[] args) {
        List list=new ArrayList();
        list(list);
        List list1=new LinkedList();
        list(list1);
    }
}
