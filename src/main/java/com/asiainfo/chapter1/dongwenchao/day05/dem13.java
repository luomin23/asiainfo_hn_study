package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/30 0030.
 */
public class dem13 extends demo12{
    private String school ;	// 扩充的属性
    public dem13(String name,int age,String school){
        this(name,age) ;	// 明确调用父类中有两个参数的构造方法
        this.school = school ;
    }
    public dem13(String name,int age){
        super(name,age) ;
    }
    public String getInfo(){
        return super.getInfo() + "；学校：" + this.school ;
    }
    public void setSchool(String school){
        this.school = school ;
    }
    public String getSchool(){
        return this.school ;
    }
    public static void main(String[] args){
        dem13 a=new dem13("张三",30,"清华大学");
        System.out.println(a.getInfo());
    }
}
