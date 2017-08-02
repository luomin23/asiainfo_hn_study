package com.asiainfo.chapter1.Jiashihao.JDK;

/**
 * Created by lenovo on 2017/7/31.
 */
import java.util.Random;
public class RandomDemo {
    public static void main(String args[]) {
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            System.out.print(r.nextInt(100) + "\t");
        }
    }
}
