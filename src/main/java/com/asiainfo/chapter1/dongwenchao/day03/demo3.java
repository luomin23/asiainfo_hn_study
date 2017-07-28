package com.asiainfo.chapter1.dongwenchao.day03;

/**
 * Created by 超超 on 2017/7/26 0026.
 */
public class demo3 {
    private String name;
    private String idNum;
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge( int newAge){
        if(newAge > 120){
            System.out.println("ERROR：error age input....");    //提示錯誤信息
        }else{
            this.age = newAge;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getIdNum(){
        return idNum;
    }
    public void setIdNum( String newId){
        idNum = newId;
    }

    public String toString() {
        return super.toString();
    }
}
