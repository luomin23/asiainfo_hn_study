package com.asiainfo.chapter1.dongwenchao.day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by 超超 on 2017/8/2 0002.
 */
public class demo3 {
public demo3(){
    String s="董稳超，有志者事竟成！置的集合元素。（*****自己理解：定义一个数组，可以在数组里实现增删改查，只要定义一个对象List books = new ArrayList();*****）  LinkedList与ArrayList、Vector的实现机制完全不同，ArrayList、Vector内部以数组的形式来保存集合中的元素，因此随机访问集合元素上有较好的性能；而LinkedList内部以链表的形式来保存集合中的元素，因此随机访问集合时性能较差，但在插入、删除元素时性能非常出色（只需改变指针所指的地址即可）。Vector因实现了线程同步功能，所以各方面性能有所下降。    Set集合不允许重复元素，是因为Set判断两个对象相同不是使用==运算符，而是根据equals方法。即两个对象用equals方法比较返回true，Set就不能接受两个对象。（Set<String> books = new HashSet<String>();这是Map的）     Treeset主要是对象比较排序用compareTo（Object";
    byte[] b=s.getBytes();
    try{
        FileOutputStream f=new FileOutputStream("文件.txt");
        f.write(b);
        f.flush();//将缓存的内容强制输出
        f.close();
    }catch (IOException e){
        System.out.println(e);
        e.printStackTrace();
    }
}
    public static void main(String []args){
        new demo3();
    }
}
