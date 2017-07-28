package com.asiainfo.chapter1.dongwenchao.day01;

/**
 * Created by 超超 on 2017/7/24 0024.
 */
public class shuzu {
        public static void main(String[] args){
		/*int array[]=new int[10]; 声明长度为10的数组*/
            int array[]={1,2,3};//声明长度为三的数组并且赋初值 1 2 3
            System.out.printf("%s%8s\n","数组元素","对应的值");
            for(int i=0;i<array.length;i++)
                System.out.printf("%s%8s\n",i,array[i]);
        }
    }

