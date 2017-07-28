package com.asiainfo.chapter1.liuwy.four;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    public BasePlusSalesEmployee(String name, int month, double sales, Double commission, double baseSalary) {
        super(name, month, sales, commission);
        this.baseSalary = baseSalary;
    }

//    public double getBaseSalary() {
//        return baseSalary;
//    }
//
//    public void setBaseSalary(double baseSalary) {
//        this.baseSalary = baseSalary;
//    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+this.baseSalary;
    }
}
