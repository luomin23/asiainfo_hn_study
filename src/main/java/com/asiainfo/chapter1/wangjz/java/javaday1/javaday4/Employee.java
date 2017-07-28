package com.asiainfo.chapter1.wangjz.java.javaday1.javaday4;

/**
 * Created by wjz123456 on 2017/7/27.
 */
public abstract class Employee implements Payable{
    private String name;
    private String ID;
    public Employee(String name,String ID){
        this.name=name;
        this.ID=ID;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public  void setid(String id){
        this.ID=id;
    }
    public String getid(){
        return  ID;
    }

    @Override
    public String toString() {
        return String.format("%s:%s\n%s:%s\n","员工姓名",getName(),"员工工号",getid());
    }
}
