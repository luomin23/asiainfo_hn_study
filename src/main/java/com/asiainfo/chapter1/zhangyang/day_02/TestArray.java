package com.asiainfo.chapter1.zhangyang.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
        import java.util.Arrays;
        import java.util.Random;

public class TestArray {
    public static void main(String[] args) {
        int[] num = new int[10]; // 声明整数数组A,把规定数组大小为10
        Random ran = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = ran.nextInt(100);
        }
        System.out.print("数组的元素包括：");
        int max;//定义最大值
        max = num[0];
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            if (num[i] > max) // 判断最大值
                max = num[i];
        }
        System.out.println("\n数组的最大值是：" + max); // 输出最大值
        System.out.println("##############");
        System.out.print("扩容后的数组元素：");
        num = Arrays.copyOf(num, 11);
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
