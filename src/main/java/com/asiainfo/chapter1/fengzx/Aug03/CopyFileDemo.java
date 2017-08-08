package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by fengzx on 2017/8/3.
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("G:\\a.txt");
        FileOutputStream fos = new FileOutputStream("G:\\copy2.txt");

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
}
