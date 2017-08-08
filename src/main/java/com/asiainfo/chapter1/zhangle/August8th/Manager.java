package com.asiainfo.chapter1.zhangle.August8th;

/**
 * Created by del on 2017/8/8.
 */
public class Manager extends Staff {
    private double bonus;

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
        this.bonus=0;
    }
    public double salary(){
        return super.getSalary()+this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



}
