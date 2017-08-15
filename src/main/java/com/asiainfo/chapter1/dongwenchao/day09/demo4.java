package com.asiainfo.chapter1.dongwenchao.day09;

import java.io.*;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class demo4 {
    /*public demo4(){
        File a=new File("编译.txt");
    }*/
    public demo4(){
        try{
            BufferedWriter a=new BufferedWriter(new FileWriter("a.txt"));
            a.write("那就这样吧，该哭的人是我吧",3,6);
            //a.write('我',5,6);
            a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)throws IOException{
        BufferedWriter a=new BufferedWriter(new FileWriter("a.txt"));
        //a.write("wojiushiwo");
        //a.write('s',5);
        // a.close();
        new demo4();
    }
}
