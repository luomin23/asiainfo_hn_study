package com.asiainfo.chapter1.Jiashihao.org.lxh.demo15;

/**
 * Created by lenovo on 2017/8/8.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Inputnumber1 {
    public static void main(String[] args) throws Exception {
        int n =0;
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.println("请输入电话号：");
        str = buf.readLine();
        n = Integer.parseInt(str);
    }
}
