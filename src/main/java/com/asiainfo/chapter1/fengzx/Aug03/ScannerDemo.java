package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.*;
import java.util.Scanner;

/**
 * Created by fengzx on 2017/8/3.
 */
public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\b.txt"));
        String line = null;
        while ((line = br.readLine()) != null){
            if ("over".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
