package com.asiainfo.chapter1.wangjz.java.javaday1.javaday7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wjz123456 on 2017/8/1.
 */
public class Arraylist {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("hello");
        list.add(711.);
        list.add("wjz");
        for (Object str:list){//foreach 遍历
            System.out.println(str);
        }
        Iterator itre=list.iterator();//迭代器遍历
       while(itre.hasNext()){
           System.out.println(itre.next());
       }
        Object[] s=new Object[list.size()];//把链表转为数组进行遍历
        list.toArray(s);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
