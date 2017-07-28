package com.asiainfo.chapter1.dongwenchao.day03;

import java.sql.Struct;
import java.sql.Time;

/**
 * Created by 超超 on 2017/7/26 0026.
 */
public class demo4 {
    private int hour;
    private int minute;
    private int second;
    public demo4(int h,int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public demo4(demo4 time){
        this(time.getHour(),time.getMinute(),time.getSecond());
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int h) {
        hour=h;
        hour=((h>=0&& h<24) ?h:0);
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int m) {
        minute=((m>=0&& m<60) ?m:0);
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int s) {
        second=((s>=0&& s<60) ?s:0);
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d:",getHour(),getMinute(),getSecond());
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",((getHour() == 0 || getHour()== 12)? 12:getHour()%12) ,getMinute() , getSecond(), (getHour()<12? "AM":"PM"));
    }


}
