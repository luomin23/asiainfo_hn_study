package com.asiainfo.chapter1.xushuo.x0802_03.collection;

import java.util.*;
/**
 * Created by root on 2017/8/3.
 * 将数组String str[] ={"W","E","C","O","M","E"};转换为ArrayList集合类型
 */
public class ListTest02 {
    public static void main(String[] args) {
        String str[] = {"W", "E", "C", "O", "M", "E"};                //定义输出
        //方法一
        ArrayList<String> arrList = new ArrayList<String>();          //创建ArrayList实例
        for (int i = 0; i < str.length; i++) {                        //循环添加元素
            arrList.add(str[i]);
        }
        Iterator<String> it = arrList.iterator();              //实例化Iterator
        while (it.hasNext())                                   //输出ArrList中的所有元素
        {
            System.out.print(it.next() + " ");
        }
    }
}

//方法二
//        List<String> list = Arrays.asList(str);                 //将数组转为List集合
//        ArrayList<String> arrList = new ArrayList<String>();    //创建ArrayList实例
//        arrList.addAll(list);                                   //将list集合中的所有元素添加进arrList
//        Iterator<String> it = arrList.iterator();                //实例化Iterator
//        while (it.hasNext());                                    //输出ArrList中的所有元素
//        {
//            System.out.println(it.next()+" ");
//        }
//    }
//}
