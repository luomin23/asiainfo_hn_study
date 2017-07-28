package com.asiainfo.chapter1.wangjz.java.javaday1.javaday3;

/**
 * Created by wjz123456 on 2017/7/26.
 */
public class Employee {
    private String name;
    private String ID;
    private double grossSales;//销售额
    private double commissionRate;//提成率
    public Employee(String name,String ID,Double sales,Double rate){
        this.name=name;
        this.ID=ID;
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double sales) {
        grossSales=(sales<0.0)?0.0:sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double rate) {
        commissionRate=(rate>0.0&&rate<1.0)?rate:0.0;
    }
    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }

    public String toString(){
        return String.format("%s:%s:\n%s:%s\n%s:%.2f\n%s:%.2f","员工姓名",getName(),"员工工号",getID(),
                "销售额",getGrossSales(),"提成率",getCommissionRate());
    }

    public static void main(String[] args) {
Employee e=new Employee("wjz","123",10000.0,0.6);
        System.out.println(e.earnings());
        System.out.println(e.toString());

    }
}
