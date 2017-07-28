package com.asiainfo.chapter1.liuwy.four;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class SalesEmployee extends EmployeeA{
    private double sales;
    private Double commission;

    public SalesEmployee(String name, int month, double sales, Double commission) {
        super(name, month);
        this.sales = sales;
        this.commission = commission;
    }

//    public int getCommission() {
//        return commission;
//    }
//
//    public double getSales() {
//        return sales;
//    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+this.commission*this.sales;
    }
}
