package com.asiainfo.chapter1.dongwenchao.web.day1;

/**
 * Created by 超超 on 2017/8/16 0016.
 */
public class CheckLogin {
    public static boolean login(String username, String password) {
        if ("admin".equals(username) && "123456".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
