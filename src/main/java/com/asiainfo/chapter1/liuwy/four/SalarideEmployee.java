package com.asiainfo.chapter1.liuwy.four;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class SalarideEmployee extends EmployeeA {
    private double monthlySalary;

    public SalarideEmployee(String name, int month, double monthlySalary) {
        super(name, month);
        this.monthlySalary = monthlySalary;
    }

//    public double getMonthlySalary() {
//        return monthlySalary;
//    }
//
//    public void setMonthlySalary(double monthlySalary) {
//        this.monthlySalary = monthlySalary;
//    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+this.monthlySalary;
    }
}
