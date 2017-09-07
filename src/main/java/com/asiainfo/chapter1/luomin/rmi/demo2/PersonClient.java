package com.asiainfo.chapter1.luomin.rmi.demo2;

/**
 * @author Luoo
 * @create 2017-08-23 14:33
 */
public class PersonClient {
    public static void main(String[] args) {
        try {
            Person person = new Person_Stub();
            int age = person.getAge();
            String name = person.getName();
            System.out.println(name + " is " + age + " years old");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}