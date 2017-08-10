package com.asiainfo.chapter1.liuwy.August07;

/**
 * Created by LENOVO on 2017/8/7.
 */
public class Goods {
    private int id;
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
