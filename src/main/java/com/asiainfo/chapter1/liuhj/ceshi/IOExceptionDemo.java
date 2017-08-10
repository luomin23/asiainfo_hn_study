package com.asiainfo.chapter1.liuhj.ceshi;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fa= new FileWriter( "aa.txt" );
               fa.write("as\r\ndkj");
               fa.flush();
               fa.close();



    }


        }

