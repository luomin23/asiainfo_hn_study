package com.asiainfo.chapter1.wangjz.java.javaday1.javaday4;

/**
 * Created by wjz123456 on 2017/7/27.
 */
public class PayableInterfaceTest {
    public static void main(String[] args) {
//     Payable p[]=new Payable[4];
//        p[1]=new Invoice("123",2,"电脑",375.00);
//        System.out.println(p[1].getPaymentAmount());
//        System.out.println(p[1].toString());
        Invoice s=new Invoice("1231",2,"电脑",375.00);
        Invoice c=new Invoice("1232",2,"U盘",75.00);
        System.out.println(c);
        System.out.println(c.getPaymentAmount());
        System.out.println(s.toString());
        System.out.println(s.getPaymentAmount());
        SalariedEmployee i=new SalariedEmployee("王景州","0001",2000.0);
        System.out.println(i);
        System.out.println(i.getPaymentAmount());

    }
}
