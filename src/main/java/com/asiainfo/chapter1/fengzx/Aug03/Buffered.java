package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by fengzx on 2017/8/3.
 */
public class Buffered {
    public static void main(String[] args) throws IOException {
//        Writer w = new FileWriter("G:\\b.txt");
//        BufferedWriter bw = new BufferedWriter(w);
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\b.txt"));

        bw.write("hello");
        bw.newLine();
        bw.flush();
        bw.write("world");
        bw.newLine();
        bw.flush();

        bw.close();
    }
}
