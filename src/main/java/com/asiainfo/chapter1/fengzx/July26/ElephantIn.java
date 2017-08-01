package com.asiainfo.chapter1.fengzx.July26;

/**
 * Created by fengzx on 2017/7/26.
 */

class Elephant{
    public void in(){
        System.out.println("我要进去！");
    }
}

class Fridge{
    public void open(){
        System.out.println("把门打开。");
    }

    public void close(){
        System.out.println("把门关上。");
    }
}
class Elephantin {
    public static void main(String[] args){
        Elephant e = new Elephant();
        Fridge f = new Fridge();

        f.open();
        e.in();
        f.close();
    }
}

