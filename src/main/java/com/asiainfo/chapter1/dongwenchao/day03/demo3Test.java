package com.asiainfo.chapter1.dongwenchao.day03;

/**
 * Created by 超超 on 2017/7/26 0026.
 */
public class demo3Test {
    public static void main(String args[]){
        demo3 encap = new demo3();
        encap.setName("James");
        encap.setAge(80);
        encap.setIdNum("12343ms");
        encap.toString();
        System.out.print("Name : " + encap.getName()+"\n"+
                " Age : "+ encap.getAge()+"\n"+"idNum :" +encap.getIdNum()+"\n");

    }
}
