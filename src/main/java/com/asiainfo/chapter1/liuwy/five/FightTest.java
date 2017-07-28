package com.asiainfo.chapter1.liuwy.five;

/**
 * Created by LENOVO on 2017/7/28.
 */
public class FightTest {
    public static void main(String[] args){
        Sword sword=new Sword();
        Knife knife=new Knife();
        Axe axe=new Axe();
        BowAndArrow bowAndArrow=new BowAndArrow();
        Fight fight=new Fight();


        Person king=new King();
        king.setBehavior(sword);
        fight.fight(king);

        Person quee=new Quee();
        quee.setBehavior(knife);
        fight.fight(quee);

        Person knight=new Knight();
        knight.setBehavior(axe);
        fight.fight(knight);

        Person troll=new Troll();
        troll.setBehavior(bowAndArrow);
        fight.fight(troll);

        Person king2=new King();
        king2.setBehavior(knife);
        fight.fight(king2);





    }
}
