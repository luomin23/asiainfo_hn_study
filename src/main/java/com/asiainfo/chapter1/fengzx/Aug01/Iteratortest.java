package com.asiainfo.chapter1.fengzx.Aug01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by fengzx on 2017/8/1.
 */
public class Iteratortest {
    public static void main(String[] args){
        Collection c = new ArrayList();

        Student s1 = new Student("fengzx",20);
        Student s2 = new Student("feng",21);
        Student s3 = new Student("fzx",22);
        Student s4 = new Student("fengxx",23);
        Student s5 = new Student("fxx",24);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

//        Iterator it = c.iterator();
//
//        while (it.hasNext()){
//            Student s = (Student) it.next();
//            System.out.println(s.getName()+"----"+s.getAge());

        for (Iterator it = c.iterator();it.hasNext();){
            Student s = (Student) it.next();
            System.out.println(s.getName()+"----"+s.getAge());
        }
    }
}
