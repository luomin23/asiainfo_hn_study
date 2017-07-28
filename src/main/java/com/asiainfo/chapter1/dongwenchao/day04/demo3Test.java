package com.asiainfo.chapter1.dongwenchao.day04;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class demo3Test {
    public static void main(String[] agrs){
        demo3 a=new demo3("董稳超","1",10000,0.1);
        System.out.println("员工基本信息：");
        System.out.printf("\n%s:\n%s\n","",a.toString());
       /* System.out.printf("%s%s\n","员工姓名：",a.getName());
        System.out.printf("%s%s\n","员工工号：",a.getID());
        System.out.printf("%s%.2f\n","销售额：",a.getXiaoshoue());
        System.out.printf("%s%.2f\n","提成率：",a.getTichenglv());
        System.out.printf("%s%.2f\n","员工工资：",a.earnings());*/
        /*a.setXiaoshoue(500);
        a.setTichenglv(.1);
        System.out.printf("\n%s:\n\n%s\n","更新以后员工信息",a.toString());*/
        /*System.out.printf("%s%.2f\n","员工工资：",a.earnings());*/
    }
}
