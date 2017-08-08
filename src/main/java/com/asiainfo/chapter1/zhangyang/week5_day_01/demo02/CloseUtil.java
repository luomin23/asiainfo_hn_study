package com.asiainfo.chapter1.zhangyang.week5_day_01.demo02;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by 11 on 2017/8/7.
 */
/*
关闭流方法
 */
public class CloseUtil {
    public static void closeAll(Closeable...io){
        for (Closeable tem:io){
            if (null!=tem){
                try {
                    tem.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
