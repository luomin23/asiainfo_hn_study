package com.asiainfo.chapter1.liangzhiqiang.day6;

/**
 * Created by 君不悔 on 2017/7/31.
 */
public class conversion {
    public static void main(String[]args){
        String str="abcd";
        System.out.println("将两个字符串转化为字符数组后的结果：");
        char[] charArray=str.toCharArray();//字符串转换为字符数组
        for (int i=0;i<charArray.length;i++){
            if (i!=charArray.length-1){
                //如果不是数组的最后一个元素，在元素后面加逗号
                System.out.println(charArray[i]+",");
            }
            else{//数组的最后一个元素后面不加逗号
                System.out.println(charArray[i]);
            }
        }
        System.out.println("将int值转换为String类型之后的结果:"+String.valueOf(12));
        System.out.println("将字符串转换成大写之后的结果："+str.toUpperCase());
    }
}
