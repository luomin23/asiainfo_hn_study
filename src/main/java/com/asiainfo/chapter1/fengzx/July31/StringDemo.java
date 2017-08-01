package com.asiainfo.chapter1.fengzx.July31;

/**
 * Created by fengzx on 2017/7/31.
 */
public class StringDemo {
    public static void main(String[] args){
        String s = new String();
        System.out.println("s:"+s);
        System.out.println("s.length:"+s.length());
        System.out.println("--------------------");

        byte[] bys = {70,101,110,103,90,88};
        String s1 = new String(bys);
        System.out.println("s1:"+s1);
        System.out.println("s1.length:"+s1.length());
        System.out.println("--------------------");

        String s2 = new String(bys,4,2);
        System.out.println("s2:"+s2);
        System.out.println("s2.length:"+s2.length());
        System.out.println("--------------------");

        char[] chs = {'a','b','c','d','e'};
        String s3 = new String(chs);
        System.out.println("s3:"+s3);
        System.out.println("s3.length:"+s3.length());
        System.out.println("--------------------");

        String s4 = new String(chs,0,3);
        System.out.println("s4:"+s4);
        System.out.println("s4.length:"+s4.length());
        System.out.println("--------------------");

        String s5 = new String("abcde");
        System.out.println("s5:"+s5);
        System.out.println("s5.length:"+s5.length());
        System.out.println("--------------------");

        String s6 = "fengzx";
        System.out.println("s6:"+s6);
        System.out.println("s6.length:"+s6.length());
        System.out.println("--------------------");

        String s7 ="hello";
        s7 += "world";
        System.out.println(s7);     //helloworld
        System.out.println("--------------------");

        String s8 = new String("hello");
        String s9 = "hello";
        System.out.println(s8 == s9);
        System.out.println(s8.equals(s9));
        System.out.println("--------------------");

        String s10 = "helloworld";
        String s11 = "hello";
        String s12 = "world";
        System.out.println(s10 == s11 + s12);
        System.out.println(s10.equals(s11 + s12));
        System.out.println(s10 == "hello" + "world");
    }
}
