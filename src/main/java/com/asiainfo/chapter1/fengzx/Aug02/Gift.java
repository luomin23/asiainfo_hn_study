package com.asiainfo.chapter1.fengzx.Aug02;

/**
 * Created by fengzx on 2017/8/2.
 */
public class Gift {
    public Gift() {
    }

    public String toString() {
        return (new StringBuilder()).append("一个价值￥").append(price).append("的")
                .append(name).toString();
    }

    public String name;
    public double price;
}
