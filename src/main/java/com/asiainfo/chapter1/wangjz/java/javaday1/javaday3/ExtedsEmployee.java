package com.asiainfo.chapter1.wangjz.java.javaday1.javaday3;

/**
 * Created by wjz123456 on 2017/7/26.
 */
public class ExtedsEmployee extends Employee {
    private double baseSalary;

    public ExtedsEmployee(String name, String ID, Double sales, Double rate, double baseSalary) {
        super(name, ID, sales, rate);
        this.baseSalary = baseSalary;
    }
    public void setBaseSalary(double salary){
        baseSalary=(salary<0.0)?0:salary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public  double earnings(){
        return  getBaseSalary()+super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s%s\n%s:%.2f","带底薪",super.toString(),"底薪",getBaseSalary());
    }

    public static void main(String[] args) {
        ExtedsEmployee s=new ExtedsEmployee("王景州","111",10000.0,0.6,2000);
        System.out.println("员工 基本信息如下：");
        System.out.printf("%s%s\n","员工姓名: ",s.getName());
        System.out.printf("%s%s\n","员工工号: ",s.getID());
        System.out.printf("%s%s\n","销售额: ",s.getGrossSales());
        System.out.printf("%s%s\n","提成率: ",s.getCommissionRate());
        System.out.printf("%s%s\n","底薪: ",s.getBaseSalary());
        System.out.printf("%s%s\n","员工工资: ",s.earnings());
        s.setGrossSales(2000);
        System.out.printf("\n%s:\n\n%s\n","更新后的工资",s.toString());
        System.out.printf("%.2f\n",s.earnings());
    }
}
