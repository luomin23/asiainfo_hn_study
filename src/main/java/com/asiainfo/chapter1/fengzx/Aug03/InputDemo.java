package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by fengzx on 2017/8/3.
 */
public class InputDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("G:\\a.txt");

//        int by = 0;
//        while ((by = fis.read())!=-1){
//            System.out.print((char)by);
//        }

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }
        fis.close();
    }

}
