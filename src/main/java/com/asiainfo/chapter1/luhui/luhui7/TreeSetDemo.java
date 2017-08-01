package com.asiainfo.chapter1.luhui.luhui7;
import java.util.TreeSet;
/**
 * Created by 18237161432 on 2017/8/1.
 */
public class TreeSetDemo {
    public static void main(String [] args){
        boolean r;
        TreeSet<String> s=new TreeSet<String>();
        r=s.add("Hello");
        System.out.println("添加单词Hello，返回为"+r);
        r=s.add("Kitty");
        System.out.println("添加单词Kitty，返回为"+r);
        r=s.add("Hello");
        System.out.println("添加单词Hello，返回为"+r);
        r=s.add("Java");
        System.out.println("添加单词Java，返回为"+r);
       /* r=s.add("Hello");
        System.out.println("添加单词Hello，返回为"+r);
        r=s.add("luhui");
        System.out.println("添加单词luhui，返回为"+r);*/
        for(String element:s)
            System.out.println(element);//TreeSet是怎么排序的？
    }

}

