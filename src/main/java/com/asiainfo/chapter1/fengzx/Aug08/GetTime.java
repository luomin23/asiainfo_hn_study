package com.asiainfo.chapter1.fengzx.Aug08;

/**
 * Created by fengzx on 2017/8/8.
 */
public abstract class GetTime {
    public long getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        return end-start;
    }
    public abstract void code();
}
