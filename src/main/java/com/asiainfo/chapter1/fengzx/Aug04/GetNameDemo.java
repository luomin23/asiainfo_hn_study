package com.asiainfo.chapter1.fengzx.Aug04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by fengzx on 2017/8/4.
 */
public class GetNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("G:\\person.txt"));
        ArrayList<String> array = new ArrayList<String>();

        String line = null;
        while ((line = br.readLine()) != null){
            array.add(line);
        }
        Random r = new Random();
        int index = r.nextInt(array.size());

        System.out.println("姓名："+array.get(index));
    }
}
