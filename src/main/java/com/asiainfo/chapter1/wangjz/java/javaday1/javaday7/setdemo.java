package com.asiainfo.chapter1.wangjz.java.javaday1.javaday7;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wjz123456 on 2017/8/2.
 */
public class setdemo {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<Person>();
        set.add(new Person("wjz",21));
        set.add(new Person("wqy",19));
        set.add(new Person("wx",20));
        set.add(new Person("wh",28));
        set.add(new Person("wqy",19));
System.out.println(set.hashCode());

        System.out.println(set);

    }
    static class Person{
        private String name;
        private int age;
//        public Person(){
//
//        }
        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        public String toString(){
            return("姓名:"+name+",年龄: "+age+"\n");
        }
    }
}
