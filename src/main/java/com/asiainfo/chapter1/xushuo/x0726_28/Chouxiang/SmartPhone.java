package com.asiainfo.chapter1.xushuo.x0726_28.Chouxiang;

/**
 * Created by root on 2017/7/28.
 */
public class SmartPhone extends Telephone implements IPlayGame{
    public void call() {
        System.out.println("通过语音打电话");
    }
    public void message() {
        System.out.println("通过语音发短信");
    }

    public void playGame() {
        System.out.println("具有了玩游戏的功能");
    }
}
