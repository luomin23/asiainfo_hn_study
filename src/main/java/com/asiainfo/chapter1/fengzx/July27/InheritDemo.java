package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by fengzx on 2017/7/27.
 */
class GrandFather{
    public void show(){
        System.out.println("GrangFather");
    }
}

class Father extends GrandFather{
    public void method(){
        System.out.println("Father");
    }
}

class Son extends Father{ }

public class InheritDemo {
    public static void main(String[] args){
        Son s = new Son();
        s.show();
        s.method();
    }
}
