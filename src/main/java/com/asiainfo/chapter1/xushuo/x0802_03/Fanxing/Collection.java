package com.asiainfo.chapter1.xushuo.x0802_03.Fanxing;

/**
 * Created by root on 2017/8/2.
 */
class Generics01{
    private Object obj;
    public void setObj(Object obj) {
        this.obj=obj;
    }
    public Object getObj(){
        return obj;
    }
}
public class Collection{
    public static void main(String[] args) {
        Generics01 gd = new Generics01();
        gd.setObj(new Integer(5));
        Integer in =(Integer)gd.getObj();
        System.out.println("设置的数值为："+in);
        gd.setObj(new Float(1.23F));
      //gd.setObj("1.23");
        Float f =(Float)gd.getObj();
        System.out.println("设置的数值为："+ f);
    }
}
