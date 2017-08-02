package com.asiainfo.chapter1.liangzhiqiang.day7;

/**
 * Created by 君不悔 on 2017/8/1.
 */
public class Notepad {
    public static void main(String[]args)throws Exception{
        Runtime rt=Runtime.getRuntime();
        Process process=rt.exec("notepad.exe");
        Thread.sleep(3000);
        process.destroy();
    }
}
