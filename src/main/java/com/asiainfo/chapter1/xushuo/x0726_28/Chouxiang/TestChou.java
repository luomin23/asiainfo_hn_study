package com.asiainfo.chapter1.xushuo.x0726_28.Chouxiang;

/**
 * Created by root on 2017/7/28.
 */
public class TestChou {
    public static void main(String[] args) {
        Telephone tele1 = new Cellphone();
        tele1.call();
        tele1.message();
        Telephone tele2 = new SmartPhone();
        tele2.call();
        tele2.message();

        IPlayGame ip1 = new SmartPhone();
        ip1.playGame();
        IPlayGame ip2 = new Psp();
        ip2.playGame();

        IPlayGame ip3 = new IPlayGame() {
            public void playGame() {
                System.out.println("使用匿名内部类的方式实现接口");
            }
        };
        ip3.playGame();

        new IPlayGame() {
            public void playGame() {
                System.out.println("使用匿名内部类的方法实现接口1");
            }
        }.playGame();
    }
}
