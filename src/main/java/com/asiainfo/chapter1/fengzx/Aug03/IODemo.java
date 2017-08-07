package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by fengzx on 2017/8/3.
 */
public class IODemo {
    public static void main(String[] args){
        FileWriter fw = null;
        try {
        fw = new FileWriter("g:\\a.txt",true);

        fw.write("hello,I coming!");
        fw.write('f');
        char[] chs = {'f','e','n','g','z','x','牛'};
        fw.write(chs);
        fw.write(chs,0,4);
        fw.write("java",1,3);
        fw.write("\r\n");

        fw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
