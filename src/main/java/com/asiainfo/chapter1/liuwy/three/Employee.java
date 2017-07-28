package com.asiainfo.chapter1.liuwy.three;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by LENOVO on 2017/7/26.
 */
public class Employee {
    private  String name;
    private  double salary;
    private Date hireDay;

    public Employee(String n, double s, int year,int month,int day) {
        name=n;
        salary=s;
        GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
        hireDay=calendar.getTime();
    }

    public Date getHireDay() {
        return hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public void setHireDay(Date hireDay) {
//        this.hireDay = hireDay;
//    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
