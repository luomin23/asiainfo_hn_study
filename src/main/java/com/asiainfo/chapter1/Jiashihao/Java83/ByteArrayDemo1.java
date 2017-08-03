package com.asiainfo.chapter1.Jiashihao.Java83;

/**
 * Created by lenovo on 2017/8/3.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
public class ByteArrayDemo1 {
    public static void main(String args[]){
        String str = "HELLO WORLD!";
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        bis = new ByteArrayInputStream(str.getBytes());
        bos = new ByteArrayOutputStream();
        int temp = 0;
        while((temp = bis.read())!= -1){
            char c = (char)temp;
            bos.write(Character.toLowerCase(c));
        }String newStr = bos.toString();
        try{
            bis.close();
            bos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(newStr);
    }
}
