package com.asiainfo.chapter1.liuwy.five;

/**
 * Created by LENOVO on 2017/7/28.
 */
public class Person {
    private String name;
    private WeaponBehavior behavior;

    public Person(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public WeaponBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(WeaponBehavior behavior) {
        this.behavior = behavior;
    }
   public void behavior(){
        behavior.behavior();
    }

}
