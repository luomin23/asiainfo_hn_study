package com.asiainfo.chapter1.luhui.luhui8;


/**
 * Created by 18237161432 on 2017/8/2.
 */
public class maximum {
    public static <T extends Comparable<T>> T maximumu1(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
    public static void main(String[] args){
        System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n",3,5,1,maximumu1(3,5,1));
        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",1.2,5.3,1.5,maximumu1(1.2,5.3,1.5));
        System.out.printf("%s",maximumu1("apple","xiangjiao","juziqwrrrrte"));
    }
}

