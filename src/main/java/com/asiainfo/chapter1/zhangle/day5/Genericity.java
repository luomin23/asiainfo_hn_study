package com.asiainfo.chapter1.zhangle.day5;

/**
 * Created by del on 2017/7/28.
 * 泛型方法
 */
public class Genericity {
    /*
    *使用泛型方法 输出各种数据类型的数组元素
    * */
    public static<Shu> void sortArray(Shu[] shu){
        /*输出方式一
        for(Shu s:shu){
            System.out.print(s+" ");
        }
        System.out.println();*/
        /*输出方式二
        for(Shu s:shu){
            System.out.printf("%s ",s);//%s代表当前位置输出字符串（String）
        }*/
        /*输出方式三*/
        for(Shu s:shu){
            System.out.format("%s ",s);
        }
    }

    /*
    * extends"如何使用在一般意义上的意思"extends"（类）或者"implements"（接口）
    * Comparable 此接口强行对实现它的每个类的对象进行整体排序
    * compareTo(T o) 比较此对象与指定对象的顺序
    * 比较各种类型的数组元素大小
    * */
    public static<Shu extends Comparable<Shu>> Shu maxNum(Shu[] shu){
        Shu max=shu[0];
        for(int i=1;i<shu.length;i++){
            //compareTo 方法比较的是两个字符串的大小
            if(shu[i].compareTo(max)>0){
                max=shu[i];
            }
        }
        /*
        System.out.println("最大值是："+max);//Shu-->void类型
        */
        return max;
    }

    public static void main(String[] args) {
        Integer[] integer ={10,5,13,2};
        String[] string ={"da","yu","dada","yuz","yi"};
        Double[] dou ={10.2,12.6,5.2,11.5};
        /*
        * compareTo(T o)是对对象的比较，所有应该使用Double对象数组
         * Double数组是一个对象数组，double型数组是一个原型数组。
        * */
        System.out.println("整数类型数组元素：");
        sortArray(integer);
        System.out.println("\n最大值是："+maxNum(integer));
        System.out.println("\n字符串类型数组元素：");
        sortArray(string);
        maxNum(string);
        System.out.println("\n最大值是："+maxNum(string));
        System.out.println("\ndouble类型数组元素：");
        sortArray(dou);
        System.out.println("\n最大值是："+maxNum(dou));

    }
}
