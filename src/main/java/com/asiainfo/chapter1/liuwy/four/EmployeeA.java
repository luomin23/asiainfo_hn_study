package com.asiainfo.chapter1.liuwy.four;

import java.util.Calendar;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class EmployeeA {
    private String name;
    private int month;


    public EmployeeA(String name, int month) {
        this.name = name;
        this.month = month;
        //this.salary = salary;
    }


    public double getSalary(int month){
        if (this.month==month){
            return 100;
        }else {
            return 0;
        }

    }
}
