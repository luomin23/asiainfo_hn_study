package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/30 0030.
 */
public class demo11 {
    public static void main(String[] args) {
        /*day08 a[]=new day08[2];
        a[0]=new demo9("0123","移动硬盘",2,25.00);
        a[1]=new demo9("0456","鼠标",5,30.00);
        for (day08 b:a){ 3
            System.out.printf("%s\n%s:$%,.2f\n\n",b.toString(),"应支付",b.getPay());
        }*/
        demo9 a = new demo9("0123","移动硬盘",2,25.00) ;
        demo9 b = new demo9("0456","鼠标",5,30.00) ;
        System.out.printf("%s\n%s:$%,.2f\n\n",a.toString(),"应支付",a.getPay());
        System.out.printf("%s\n%s:$%,.2f\n\n",b.toString(),"应支付",b.getPay());
    }
}
