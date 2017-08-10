package com.asiainfo.chapter1.liuhj.August08;


import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        FileWriter  fw = new FileWriter("123.txt",true);
                    fw.write("fwfrwnef");
                    fw.flush();
                    fw.close();
    }



}
