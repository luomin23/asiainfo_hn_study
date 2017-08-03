package com.asiainfo.chapter1.zhangle.August2nd;

import java.util.*;

/**
 * Created by del on 2017/8/2.
 */
public class SetJava {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*set输出
        * 元素不重复 无序
        * 迭代遍历
        * */
    public static void iterator(Set set){
        Iterator<String> i=set.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }

    }
    public static void print(Set set){
        for(Object o:set){
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println("使用toString方法输出");
        System.out.println(set.toString());
        System.out.println(set.size());
    }
    public static void testSet(){
        List list=new ArrayList();
        list.add("one");
        list.add("two");
        list.add(2,"first");
        Set set=new HashSet();
        set.add("st");  //添加元素
        set.add("ones");
        set.add("ones");
        set.addAll(list);  //将list的元素添加到set内
        iterator(set);
        set.clear();  //清除添加的元素
        print(set);
    }

    public static void main(String[] args) {
        testSet();
        Integer i=new Integer(20);
        int in=10;
        String s=i.toBinaryString(in);
        System.out.println(i.toBinaryString(in));//toBinaryString输出的结果是String类型把十进制的in转变成二进制
        System.out.println(i.toBinaryString(10).getClass());

    }

}


