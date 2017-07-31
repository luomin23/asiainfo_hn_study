package com.asiainfo.chapter1.sunmd1.Map_0731.hashmap;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String, String>();

        //添加--key相同值覆盖
        hm.put("10010","胡歌");
        hm.put("10011","霍建华");
        hm.put("10012","彭于晏");
        hm.put("10013","袁弘");
        hm.put("10010","胡椒粉");
        System.out.println(hm);

        //hashmap中存储的key如果是对象的话，对象的内容相同，就是属于同一个对象，需要重写hashcode,equals
        HashMap<Student,String> hm1 = new HashMap<Student, String>();
        Student s1 = new Student(20,"胡歌");
        Student s2 = new Student(22,"霍建华");
        Student s3 = new Student(24,"彭于晏");
        Student s4 = new Student(20,"胡歌");
        hm1.put(s1,"100");
        hm1.put(s2,"101");
        hm1.put(s3,"102");
        hm1.put(s4,"103");
        //遍历
        Set<Student> students =  hm1.keySet();
        for(Student s:students){
            System.out.println(s.getName()+"--"+hm1.get(s));
        }


    }


}
