package com.asiainfo.chapter1.luomin.container;

/**
 * @author Luoo
 * @create 2017-08-01 11:07
 */

public class GenericBean<T> {

    private T genericObj;

    public GenericBean(T genericObj) {
        this.genericObj = genericObj;
    }

    public T getGenericObj() {
        return genericObj;
    }

    public void showTyep() {
        System.out.println("T的实际类型是: " + genericObj.getClass().getName());
    }


    public static void main(String[] args) {
        GenericBean<Integer> intOb = new GenericBean<Integer>(100);
        intOb.showTyep();
        System.out.println("value= " + intOb.getGenericObj());
        System.out.println("----------------------------------");

        GenericBean<String> strOb = new GenericBean<String>("CSDN_SEU_Calvin");
        strOb.showTyep();
        System.out.println("value= " + strOb.getGenericObj());

    }

}
