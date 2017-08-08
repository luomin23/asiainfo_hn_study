package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by fengzx on 2017/8/3.
 */
public class CopyImg {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("G:\\picture.jpg");
        FileOutputStream fos = new FileOutputStream("G:\\copy.jpg");

        int by = 0;
        while ((by = fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
