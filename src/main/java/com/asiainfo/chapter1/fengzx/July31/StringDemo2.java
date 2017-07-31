package com.asiainfo.chapter1.fengzx.July31;

/**
 * Created by fengzx on 2017/7/31.
 */
public class StringDemo2 {
    public static void main(String[] args){
        String s = "helloworld";

        System.out.println("equals: "+s.equals("helloworld"));    //true
        System.out.println("equals: "+s.equals("Helloworld"));    //false

        System.out.println("equalsIgnoreCase: "+s.equalsIgnoreCase("helloworld"));    //true
        System.out.println("equalsIgnoreCase: "+s.equalsIgnoreCase("Helloworld"));    //true

        System.out.println("contains: "+s.contains("java"));    //false
        System.out.println("contains: "+s.contains("owo"));     //true

        System.out.println("endWith: "+s.endsWith("java"));     //flase
        System.out.println("endWith: "+s.endsWith("d"));        //true
        System.out.println("endWith: "+s.endsWith("ld"));       //true

        System.out.println("startsWith: "+s.startsWith("java"));   //flase
        System.out.println("startsWith: "+s.startsWith("hel"));    //true

        System.out.println("isEmpty: "+s.isEmpty());    //false
        String ss = "";
        System.out.println("isEmpty: "+ss.isEmpty());   //true
//        String sss = null;
//        System.out.println("isEmpty: "+sss.isEmpty());
    }
}
