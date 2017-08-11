package com.asiainfo.chapter1.xushuo.x0807.anomaly;

/**
 * Created by root on 2017/8/4.
 * 双catch捕捉除数为0异常和数组下标越界异常。
 */
public class TestExceptionDemo {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        try {
            for (int i = 0;i <= intArray.length; i++) {
                intArray[i] = i ;
                System.out.println("intArray[" +i+"]"+intArray[i]);
                System.out.println("intArray[" +i+"]模"+(i-2)+"的值:"+intArray[i]%(i-2));
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("intArray数组的下标越界异常。");
        }catch (ArithmeticException e) {
            System.out.println("除数为0异常");
        }
        System.out.println("程序正常结束");
    }
}
