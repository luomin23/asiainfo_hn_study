package com.asiainfo.chapter1.xushuo.x0726_28;

/**
 * Created by root on 2017/7/27.
 */
public abstract class Choux {
    private String name;
    private String address;
    private int number;
    public Choux(String name, String address, int number) {
        System.out.println("Constructing an Choux");
        this.name=name;
        this.address=address;
        this.number=number;
    }
    public double computePay()
    {
        System.out.println("Inside Employe computPay");
        return 0;
    }
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + this.name+" "+this.address);
    }
    public String toString()
    {
        return name+" "+address+" "+number;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        address=newAddress;
    }
    public int getNumber()
    {
        return number;
    }
}