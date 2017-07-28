package com.asiainfo.chapter1.liuwy.four;

/**
 * Created by LENOVO on 2017/7/27.
 */

public class BirdsTest {
    public static  void main(String[] args){
        Tan tan=new Tan();
        ZhengFly zheng=new ZhengFly();
        JiasuFly jia=new JiasuFly();
        FenFly fen=new FenFly();

        Bird bird1=new RedBird();
        bird1.setFly(zheng);
        tan.tan(bird1);

        Bird bird2=new RedBird();
        bird2.setFly(jia);
        tan.tan(bird2);

        Bird bird3=new BlueBird();
        bird3.setFly(fen);
        tan.tan(bird3);

        Bird bird4=new YellowBird();
        bird4.setFly(jia);
        tan.tan(bird4);

    }


}
