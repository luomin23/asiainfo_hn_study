package com.asiainfo.chapter1.fengzx.July26;

/**
 * Created by fengzx on 2017/7/26.
 */
class Phone {
    String brand;
    String color;
    int price;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }

    public void online(){
        System.out.println("上网");
    }
}

class PhoneDemo {
    public static void main(String[] args){
        Phone p = new Phone();
        System.out.println(p.brand+"-----"+p.color+"-----"+p.price);

        p.brand = "MEIZU";
        p.color = "白色";
        p.price = 2499;
        System.out.println(p.brand+"-----"+p.color+"-----"+p.price);

        p.call("fengzx");
        p.sendMessage();
        p.online();
    }
}