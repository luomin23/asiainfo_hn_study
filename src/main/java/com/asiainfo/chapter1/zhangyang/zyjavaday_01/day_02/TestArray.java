package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
        import java.util.Arrays;
        import java.util.Random;

public class TestArray {
    public static void main(String[] args) {
        int[] num = new int[10]; // ������������A,�ѹ涨�����СΪ10
        Random ran = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = ran.nextInt(100);
        }
        System.out.print("�����Ԫ�ذ�����");
        int max;//�������ֵ
        max = num[0];
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            if (num[i] > max) // �ж����ֵ
                max = num[i];
        }
        System.out.println("\n��������ֵ�ǣ�" + max); // ������ֵ
        System.out.println("##############");
        System.out.print("���ݺ������Ԫ�أ�");
        num = Arrays.copyOf(num, 11);
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
