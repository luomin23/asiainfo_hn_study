package com.asiainfo.chapter1.zhangle.day3;

/**
 * Created by del on 2017/7/26.
 */
public enum Nums {

    First("第一",1),Second("第二",2),Third("第三",3),Forth("第四",4);
    private String name;
    private int index;
    private Nums(String name, int index){
        this.name=name;
        this.index=index;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setIndex(int index){
        this.index=index;
    }
    public int getIndex(){
        return index;
    }

}
