package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/28 0028.
 */
public abstract class demo2 {
    private String name;
    private String ID;
    public demo2(String name,String ID){
        this.name=name;
        this.ID=ID;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return String.format("%s:%s\n%s:%s\n","员工姓名",getName(),"员工ID",getID());
    }
    public abstract double earnings();
    public abstract double earnings1();
}


