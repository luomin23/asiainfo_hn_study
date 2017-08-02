package com.asiainfo.chapter1.liangzhiqiang.day7;

/**
 * Created by 君不悔 on 2017/8/1.
 */
public class Copy {
    public static void main(String[]args){
        int[]formArray={101,102,103,104,105,106};
        int[]toArray={201,202,203,204,205,206};
        System.arraycopy(formArray,2,toArray,3,4);
        for(int i=0;i<toArray.length;i++){
            System.out.println(i+":"+toArray[i]);

        }
    }
}
