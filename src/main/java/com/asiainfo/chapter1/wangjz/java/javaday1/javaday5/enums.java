package com.asiainfo.chapter1.wangjz.java.javaday1.javaday5;

/**
 * Created by wjz123456 on 2017/7/28.
 */
public enum enums {
    mon,tue,wed,thu,fri,sat,sun;
    public static void main(String[] args) {
for (enums s:enums.values()){
    System.out.println(s.ordinal()+" "+s.name());
}
    }

}
