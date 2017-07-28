package com.asiainfo.chapter1.liangzhiqiang.day2;

/**
 * Created by 君不悔 on 2017/7/26.
 */
import java.util.Random;
public class Title7 {
        public static void main(String[] args) {
            Random random=new Random();
            int[] nums=new int[11];
            nums[10]=0;
            //
            System.out.print("数组中的数据为：[ ");
            for(int i=0;i<=9;i++){
                nums[i]=random.nextInt(100);//产生1-100之间的随机整数
                System.out.print(nums[i]+" ");
                if(nums[i]>=nums[10]){
                    nums[10]=nums[i];
                }
            }
            System.out.println("]");
            System.out.println("最大值为："+nums[10]);
            System.out.print("新数组中的数据为：[ ");
            for(int a:nums){
                System.out.print(a+" ");
            }
            System.out.println("]");
        }

    }

