package com.asiainfo.chapter1.wangjz.java.javaday1.javaday4;

/**
 * Created by wjz123456 on 2017/7/27.
 */
public class SalariedEmployee extends Employee {
private double weeklyAlary;

    public SalariedEmployee(String name, String ID, Double salary) {
        super(name, ID);
        setWeeklyAlary(salary);
    }

    public double getWeeklyAlary() {
        return weeklyAlary;
    }

    public void setWeeklyAlary(double salary) {
        weeklyAlary=salary<0.0?0.0:salary;
    }

    public double getPaymentAmount() {
        return getWeeklyAlary();
    }

    @Override
    public String toString() {
        return String.format("周❤员工工资:\n%s%s:$%,.2f",super.toString(),"工资",getWeeklyAlary());
    }
}
