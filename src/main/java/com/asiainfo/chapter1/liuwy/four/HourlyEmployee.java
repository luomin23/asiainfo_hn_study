package com.asiainfo.chapter1.liuwy.four;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class HourlyEmployee extends EmployeeA {
    private double hourlySalary;
    private  int hours;

    public HourlyEmployee(String name, int month, double hourlySalary, int hours) {
        super(name, month);
        this.hourlySalary = hourlySalary;
        this.hours = hours;
    }

    @Override
    public double getSalary(int month) {
        double salary;
        if(this.hours<=160){
            salary=this.hourlySalary*this.hours;

    }else{
            salary=this.hourlySalary*160+this.hourlySalary*(hours-160)*1.5;
        }
        return super.getSalary(month)+salary;
    }
}
