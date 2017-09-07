package com.asiainfo.chapter1.luomin.pattern.proxy.normal;

/**
 * @author Luoo
 * @create 2017-08-25 9:29
 */

public class NormalClient {
    public static void main(String[] args) {

        new StationProxy(new Station()).sellTicket();
    }
}
