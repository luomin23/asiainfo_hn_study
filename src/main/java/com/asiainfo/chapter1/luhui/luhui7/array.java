package com.asiainfo.chapter1.luhui.luhui7;
import java.util.HashSet;
/**
 * Created by 18237161432 on 2017/8/1.
 */
public class array {
    public static void main(String [] args){
        boolean r;
        HashSet<String> s=new HashSet<String>();
        r=s.add("Hello");
        System.out.println("添加单词Hello，返回为"+r);
        r=s.add("Kitty");
        System.out.println("添加单词Kitty，返回为"+r);
        r=s.add("Hello");
        System.out.println("添加单词Hello，返回为"+r);
        r=s.add("Java");
        System.out.println("添加单词Java，返回为"+r);
        r=s.add("Hello");
        System.out.println("添加单词Hello，返回为"+r);
        for(String element:s)
            System.out.println(element);//输出的数组是无序的。因为set类型的集合不能存放重复的数据。
    }

}
