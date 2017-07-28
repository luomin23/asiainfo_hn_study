package com.asiainfo.chapter1.liuwy.three;

/**@author liuwy
 * Created by LENOVO on 2017/7/26.
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff=new Employee[3];
        staff[0] = new Employee("LIU",75000,1987,12,15);
        staff[1] = new Employee("WEN",50000,1989,10,1);
        staff[2] = new Employee("YAN",40000,1900,3,15);
        for (Employee e:staff) {
            e.raiseSalary(5);

        }
        for (Employee e:staff) {
            System.out.println("姓名："+e.getName()+",工资："+e.getSalary()+",雇佣时间："+e.getHireDay());

        }

    }

}
