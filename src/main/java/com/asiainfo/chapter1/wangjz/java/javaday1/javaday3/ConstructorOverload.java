package com.asiainfo.chapter1.wangjz.java.javaday1.javaday3;

/**
 * Created by wjz123456 on 2017/7/26.
 */
public class ConstructorOverload {
    private int hour;
    private int minute;
    private int second;
    public ConstructorOverload(int h,int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public ConstructorOverload(ConstructorOverload C){
        this(C.getHour(),C.getMinute(),C.getSecond());
    }

    public void setSecond(int s) {
        second=((s>=0&&s<60)?s:0);
    }

    public void setMinute(int m) {
        minute=((m>=0&&m<60)?m:0);
    }

    public void setHour(int h) {

        hour=((h>=0&&h<24)?h:0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }

    @Override
    public String toString() {
       return String.format("%d:%02d:%02d:%S",(getHour()==0||getHour()==12)?12:getHour()%12,
        getMinute(),getSecond(),(getHour()<12?"AM":"PM"));
    }

    public static void main(String[] args) {
        ConstructorOverload t1=new ConstructorOverload(24,20,30);
        ConstructorOverload t2=new ConstructorOverload(22,9,41);
        System.out.println(t1.toUniversalString());
       System.out.printf("%s\n",t1.toString());
        System.out.println(t2.toUniversalString());
        System.out.printf("%s\n",t2.toString());
        ConstructorOverload t3=new ConstructorOverload(t1);
        System.out.println(t3.toUniversalString());
        System.out.printf("%s\n",t3.toString());
    }
}
