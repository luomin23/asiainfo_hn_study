package com.asiainfo.chapter1.liangzhiqiang.day6;

/**
 * Created by 君不悔 on 2017/7/31.
 */
public class substring {
    public static void main(String[]args){
        String str="羽毛球-篮球-乒乓球";
        System.out.println("从第五个字符截取到末尾的结果："+str.substring(4));
        System.out.println("从第五个字符截取到第六个字符的结果："+str.substring(4,6));
        System.out.println("分隔后的字符串数组中的元素依次为：");
        String[] strArray=str.split("-");//将字符串转换为字符串数组
        for (int i=0;i<strArray.length;i++){
            if (i!=strArray.length-1){
                //如果不是数组的最后一个元素，在元素后面加逗号
                System.out.print(strArray[i]+",");
            }
            else {
                //数组的最后一个元素后面不加逗号
                System.out.println(strArray[i]);
            }
        }
    }
}
