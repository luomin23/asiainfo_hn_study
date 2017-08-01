package com.asiainfo.chapter1.luomin.io;

import java.io.UnsupportedEncodingException;

/**
 * @author Luoo
 * @create 2017-07-31 17:35
 */

public class CharacterExercises {

    public static void main(String[] args) {
        try {
            byte[] buf = "我".getBytes("UTF-8");

//            System.out.println(buf.length);
            
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String greeting = "Hello";

        int n = greeting.length();// is 5

    }
}
