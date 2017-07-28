package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by febgzx on 2017/7/27.
 */
class Phone{
    private String brand;
    private int price;

    public Phone(){}

    public Phone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
public class PhoneDemo {
    public static void main(String[] args){
        Phone p = new Phone();
        p.setBrand("苹果");
        p.setPrice(4999);
        System.out.println("品牌是："+p.getBrand()+"   价格是："+p.getPrice());

        Phone pp = new Phone("华为",998);
        System.out.println("品牌是："+pp.getBrand()+"   价格是："+pp.getPrice());
    }
}
