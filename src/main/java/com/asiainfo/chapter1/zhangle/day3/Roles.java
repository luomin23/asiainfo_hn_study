package com.asiainfo.chapter1.zhangle.day3;

/**
 * Created by del on 2017/7/26.
 */
public class Roles {
    private int id;
    private String name;
    private int password;
    public int getId(int id){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPassword(int password){
        return password;
    }
    public void setPassword(int password){
        this.password=password;
    }

    public Roles(String name,int password){
        System.out.println("name="+getName(name)+" password:"+getPassword(password));
    }
    public Roles(){
        System.out.println("name="+getName(name)+" password:"+getPassword(password));
    }
    public void Role(){
        System.out.println("name="+getName(name)+" password:"+getPassword(password));
    }

    public static void main(String[] args) {
        Roles r=new Roles("zl",1234);
        Roles ro=new Roles();
        ro.setName("sl");
        ro.setPassword(123);
        ro.Role();
    }
}
