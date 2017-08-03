package com.asiainfo.chapter1.xushuo.x0802_03.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by root on 2017/8/3.
 * 没有重写equals()和hashCode()方法的HashSet集合
 */
class Person {
    private String name;
    private int age;
    public Person() {
    }
    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public String toString() {
        return ("姓名:"+name+",年龄："+age+"\n");
    }
}
public class HashSetDemo01 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        set.add(new Person("小强",21));
        set.add(new Person("小红",19));
        set.add(new Person("张飞",31));
        set.add(new Person("李逵",30));
        set.add(new Person("小强",21));
        set.add(new Person("小强",21));
        System.out.println(set);
    }
}
