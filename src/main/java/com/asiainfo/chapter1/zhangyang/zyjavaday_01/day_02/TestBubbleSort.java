package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
        import java.util.Arrays;
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 7, 9, 4, 1, 3, 0, 6, 5 };
        System.out.println("---ð�ݿ�ʼ----");
        for (int i = 0; i < arr.length - 1; i++) {//���ѭ��������������
            for (int j = 0; j < arr.length - 1 - i; j++) {// �ڲ�ѭ������ÿһ��������ٴ�
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("----ð�ݽ���----");
        System.out.println(Arrays.toString(arr));
    }
}
