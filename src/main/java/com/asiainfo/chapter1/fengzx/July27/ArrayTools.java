package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by fengzx on 2017/7/27.
 */
public class ArrayTools {

    private ArrayTools(){}

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x = 0;x < arr.length;x++){
            if (x==arr.length-1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x]+"，");
            }
        }
        System.out.print("]");
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int x = 1;x < arr.length;x++){
            if (arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }

    public static int getIndex(int[] arr,int value){
        int index = -1;
        for (int x = 0;x < arr.length;x++){
            if (arr[x]==value){
                index = x;
                break;
            }
        }
        return index;
    }
}
