package com.asiainfo.chapter1.liuwy.August02;

/**
 * Created by LENOVO on 2017/8/2.
 */
public class Goods {
    private int id;
    private String name;
    private double price;
    private int number;
    private Boolean online;

    public Goods() {
    }

    public Goods(int id, String name, double price, int number, Boolean online) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.online = online;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
