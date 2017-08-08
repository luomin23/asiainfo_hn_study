package com.asiainfo.chapter1.zhangle.August8th;

/**
 * Created by del on 2017/8/8.
 */
public class Staff {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Staff(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
