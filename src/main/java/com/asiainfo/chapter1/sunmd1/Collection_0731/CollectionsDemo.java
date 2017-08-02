package com.asiainfo.chapter1.sunmd1.Collection_0731;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1.Collections:对集合操作的工具类，静态方法
 * 2.Collection：单列的顶层集合，子接口List,set
 * 3.方法：
 * public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
 * public static <T> int binarySearch(List<?> list,T key):二分查找
 * public static <T> T max(Collection<?> coll):最大值
 * public static void reverse(List<?> list):反转
 * public static void shuffle(List<?> list):随机置换
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(50);
        list.add(2);
        list.add(30);
        list.add(40);

        //排序
        list = sort(list);
        System.out.println(list);

        //二分查找：先排序后查找，存在>=0
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,50));

        //最大值
        System.out.println(Collections.max(list));

        //随机置换
        System.out.println(shuffle(list));


    }

    //public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
    public static List<Integer> sort(List<Integer> list){
        Collections.sort(list);
        return list;
    }

    //public static <T> int binarySearch(List<?> list,T key):二分查找

    public static int binarySearch(List<Integer> list,int key){
       return Collections.binarySearch(list,key);
    }

    // public static void shuffle(List<?> list):随机置换
    public static List<Integer> shuffle(List<Integer> list){
        Collections.shuffle(list);
        return list;
    }


}
