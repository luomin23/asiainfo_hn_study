package com.asiainfo.chapter1.zhangyang.week4_day_01_collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 11 on 2017/7/31.
 */

    class Person{
        private String name;
        private  int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public  String toString(){
           return ("姓名:"+name+",年龄"+age+"\n");
        }
    }
public class HashSetDemo01 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        set.add(new Person("小强",21));
        set.add(new Person("小卫",23));
        set.add(new Person("小强",21));
        set.add(new Person("小强",21));
        set.add(new Person("小琴",20));
        set.add(new Person("小婷",20));
        System.out.println(set);
    }
}
