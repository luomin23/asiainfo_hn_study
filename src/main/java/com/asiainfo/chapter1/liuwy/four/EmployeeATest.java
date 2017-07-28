package com.asiainfo.chapter1.liuwy.four;

import com.asiainfo.chapter1.liuwy.three.Employee;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class EmployeeATest {
    public static void main(String[] args){
        EmployeeA salaried=new SalarideEmployee("LIU",7,2000);
        EmployeeA sales=new SalesEmployee("L",6,20000,0.5);
        EmployeeA hour=new HourlyEmployee("W",5,150,20);
        EmployeeA base=new BasePlusSalesEmployee("Y",9,10000,0.5,10000);
        System.out.println(salaried.getSalary(7));
        System.out.println(sales.getSalary(7));
        System.out.println(hour.getSalary(7));
        System.out.println(base.getSalary(7));
    }
}
