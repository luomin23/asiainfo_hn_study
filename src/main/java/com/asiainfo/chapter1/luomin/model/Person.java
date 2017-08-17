package com.asiainfo.chapter1.luomin.model;

/**
 * @author Luoo
 * @create 2017-08-17 15:42
 */

public class Person {
    private String name;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
