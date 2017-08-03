package com.asiainfo.chapter1.liuwy.six;

import java.util.Comparator;


/**
 * Created by LENOVO on 2017/7/31.
 */
public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int scrod;

    public Student(int id, String name, int scrod) {
        this.id = id;
        this.name = name;
        this.scrod = scrod;
    }

    @Override
    public int compareTo(Student student) {
        return this.id-student.id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScrod() {
        return scrod;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScrod(int scrod) {
        this.scrod = scrod;
    }
}
