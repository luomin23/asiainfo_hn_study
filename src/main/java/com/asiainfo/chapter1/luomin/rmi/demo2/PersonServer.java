package com.asiainfo.chapter1.luomin.rmi.demo2;

/**
 * @author Luoo
 * @create 2017-08-23 14:29
 */

public class PersonServer implements Person {
    private int age;
    private String name;

    public PersonServer(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static void main(String args[]) {
        // new object server
        PersonServer person = new PersonServer("Richard", 34);
        Person_Skeleton skel = new Person_Skeleton(person);
        skel.start();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}