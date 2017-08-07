package com.asiainfo.chapter1.luhui.luhui9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 18237161432 on 2017/8/3.
 */
public class FileinputStream {
    public FileinputStream(){
        try{
            File f=new File("D:\\ideaIU\\a.txt");
            InputStreamReader ii=new InputStreamReader(new FileInputStream(f),"GBK");
            int i;

            char b= (char) ii.read();
            for (i=0;b!=-1;i++){
                System.out.print((char)b);
                b= (char) ii.read();
            }
            System.out.println();
            System.out.println("字符数 "+i);
            ii.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new FileinputStream();
    }
}


