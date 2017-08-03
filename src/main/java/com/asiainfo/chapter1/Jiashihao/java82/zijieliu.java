package com.asiainfo.chapter1.Jiashihao.java82;

/**
 * Created by lenovo on 2017/8/2.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class zijieliu {
    public static void main(String[]args) throws Exception {
        File f = new File("d:"+File.separator+"test.txt");
        OutputStream out = null;
        out = new FileOutputStream(f);
        String str = "HELLO WORLD!!!";
        byte b[] = str.getBytes();
        out.write(b);
    }
}
