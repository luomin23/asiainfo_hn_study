package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
        import java.util.Arrays;
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 7, 9, 4, 1, 3, 0, 6, 5 };
        System.out.println("---冒泡开始----");
        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {// 内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("----冒泡结束----");
        System.out.println(Arrays.toString(arr));
    }
}
