package com.asiainfo.chapter1.luomin.container;

import java.util.List;

/**
 * @author Luoo
 * @create 2017-08-01 11:01
 */

public class GenericExercise {


    //此行若把Number换为“？”编译通过
    public static void getData(GenericBean<Number> temp) {

        //do something...
    }

//    需要一个在逻辑上可以用来同时表示为List<Integer>和List<Number>的父类的一个引用类型，类型通配符应运而生
    public static void getGenData(GenericBean<?> temp) {

        //do something...
        System.out.println(temp.getGenericObj());
    }

    public static void getUpperNumberData(GenericBean<? extends Number> temp){
        System.out.println("class type :" + temp.getClass());
    }



    public static void main(String[] args) {
        GenericBean<Integer> ex_int = new GenericBean<Integer>(100);
//        List<Number> ex_num = ex_int; //非法的
        GenericBean<Number> ex_num = new GenericBean<Number>(200);
        getData(ex_num);
//        getData(ex_int);   //非法

        getGenData(ex_num);
        getGenData(ex_int);

        System.out.println("----------------------");

        getUpperNumberData(ex_num);
        getUpperNumberData(ex_int);

//        不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错
/*        if(ex_num instanceof GenericBean<Number>){


        }*/


//        不能创建一个确切的泛型类型的数组。
//        List<String>[] lsa = new List<String>[10];

//        采用通配符的方式是被允许的
        List<?>[] lsa = new List<?>[10];


    }
}
