package com.asiainfo.chapter1.xushuo.x0802_03.collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 2017/8/2.
 * ArrrayList类向集合添加元素、删除元素
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>(); //通过ArrayList实例化Collection
        List<String> list = new ArrayList<String>();             //通过ArrayList实例化List
        collection.add("1");
        collection.add("2");
        collection.add("3");
        System.out.println("collection 集合:"+collection);        //打印集合中的元素
        list.add("A");                                           //添加元素
        list.add("B");
        list.add("C");
        list.add(1,"B");                                         //向指定位置添加元素
        list.addAll(0,collection);                               //向指定位置添加一个集合的所有元素
        System.out.println("list 集合删除前："+list);                   //打印集合中的元素
        System.out.println("list集合中，元素3的位置："+list.indexOf("3")+",元素E的位置："+list.indexOf("D"));
                                                                //获取指定元素在集合中的索引位置，若不存在则返回-1
        String arrString[] = list.toArray(new String[]{});      //将集合转为字符串数组
        for (String str : arrString) {
            System.out.print(str+" ");
        }
        System.out.println("\nlist集合是否为空："+list.isEmpty());
        list.remove("B");
        System.out.println("list 集合删除(B)："+list);                   //打印集合中的元素
        list.remove(3);
        System.out.println("list 集合删除(3)："+list);                   //打印集合中的元素
        list.removeAll(collection);
        System.out.println("list 集合删除(collection)："+list);          //打印集合中的元素
        list.clear();                                                  //清除集合中的所有元素
        System.out.println("\nlist 集合是否为空："+list.isEmpty());       //判断集合是否为空
    }
}
