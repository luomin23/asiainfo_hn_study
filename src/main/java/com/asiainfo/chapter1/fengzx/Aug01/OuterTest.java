package com.asiainfo.chapter1.fengzx.Aug01;

import com.asiainfo.chapter1.fengzx.July27.InheritDemo;

/**
 * Created by fengzx on 2017/8/1.
 */

interface Inter1{
    public abstract void show();
}

class InterImpl implements Inter1{
    public void show(){
        System.out.println("show Inter");
    }
}

class InterDemo{
    public void method(Inter1 i){
        i.show();
    }
}

public class OuterTest {
    public static void main(String[] args){
        InterDemo id = new InterDemo();

//        Inter1 i = new InterImpl();
//        id.method(i);

        id.method(new Inter1() {
            @Override
            public void show() {
                System.out.println("show Inter");
            }
        });
    }
}
