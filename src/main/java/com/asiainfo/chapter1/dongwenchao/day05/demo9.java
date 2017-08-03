package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/30 0030.
 */
public class demo9 implements demo8{
    private String partNumber;
    private String partgongneng;
    private int shuliang;
    private double danjia;
    public demo9(String part,String gn,int sl,double dj){
        partNumber=part;
        partgongneng=gn;
        setShuliang(sl);
        setDanjia(dj);
    }
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String part) {
       partNumber = part;
    }

    public double getDanjia() {
        return danjia;
    }

    public void setDanjia(double dj) {
        danjia=(dj<0)?0.0:dj;
    }

    public int getShuliang() {
        return shuliang;
    }

    public void setShuliang(int sl) {
        shuliang=(sl<0)?0:sl;
    }

    public String getPartgongneng() {
        return partgongneng;
    }

    public void setPartgongneng(String gn) {
        partgongneng = gn;
    }
    public String toString(){
        return String.format("%s:\n%s:%s(%s)\n%s:%d\n%s:$%,.2f","发票","物品名称",getPartNumber(),getPartgongneng(),"物品数量",getShuliang(),"物品单价",getDanjia());
    }
    public double getPay(){
        return getShuliang()*getDanjia();
    }

}
