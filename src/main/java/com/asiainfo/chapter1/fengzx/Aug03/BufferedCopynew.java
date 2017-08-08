package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.*;

/**
 * Created by fengzx on 2017/8/3.
 */
public class BufferedCopynew {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("G:\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\copy.txt"));

        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
