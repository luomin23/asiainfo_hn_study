package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/28 0028.
 */
public class demo4Test {
    public static void main(String[] args){
        demo3 a=new demo3("董稳超","010010",100.00);
        System.out.println("员工工资情况如下：\n");
        System.out.printf("%s\n%s:%,.2f\n\n",a,"工资",a.earnings());
    }
}
