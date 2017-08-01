package com.asiainfo.chapter1.fengzx.July31;

/**
 * Created by fengzx on 2017/7/31.
 */
public class RegexDemo2 {
    public static void main(String[] args){
        String ages = "28-35";
        String regex = "-";

        String[] ageArray = ages.split(regex);

        for (int x = 0;x < ageArray.length;x++){
            System.out.println(ageArray[x]);
        }

        int startAge = Integer.parseInt(ageArray[0]);
        int endAge = Integer.parseInt(ageArray[1]);
    }
}
