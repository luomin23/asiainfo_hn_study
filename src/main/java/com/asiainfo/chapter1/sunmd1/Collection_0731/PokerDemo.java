package com.asiainfo.chapter1.sunmd1.Collection_0731;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 模拟斗地主洗牌和发牌
 *
 * 分析：
 * 		A:创建一个牌盒
 * 		B:装牌:"♥A","♠3","♦6","♣2"----------"♥，♠，♦，♣"与
 * 	            “3,4,5,6,7,8,9,10，J,Q,K,A,2”组合+“大王，小王“
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */
public class PokerDemo {

    //牌盒
    private List<String> list = new ArrayList<String>();
    private String[] tuan = {"♥","♠","♦","♣"};
    private String[] pai = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    private String[] people = {"胡歌","彭于晏","袁弘"};

    //斗地主---洗牌，发牌，看牌
    public void doudizhu(){
        //装牌
        for (String t:tuan){
            for(String p:pai){
                list.add(t+p);
            }
        }

        list.add("小王");
        list.add("大王");

        //洗牌
        Collections.shuffle(list);

        //发牌----3个牌盒，1个底牌盒

        List<String> huge = new ArrayList<String>();
        List<String> pengyuyan = new ArrayList<String>();
        List<String> yuanhong = new ArrayList<String>();
        List<String> dipai = new ArrayList<String>();

        //发牌
        int x = 0;
        for (int i=0;i<list.size();i++) {
            //最后3长是底牌
            if(i>=list.size()-3){
                dipai.add(list.get(i));
            }else if(i%3==0){
                huge.add(list.get(i));
            }else if(i%3==1){
                pengyuyan.add(list.get(i));
            }else if(i%3==2){
                yuanhong.add(list.get(i));
            }
        }

        //看牌---3个人看牌，抽取成for循环/方法----抽取成方法
        lookpai(people[0],huge);
        lookpai(people[1],pengyuyan);
        lookpai(people[2],yuanhong);
        lookpai("底牌",dipai);

    }

    private void lookpai(String peo, List<String> list) {
        System.out.println(peo+"的牌是:");
        for (String pai:list) {
            System.out.print(pai+" ");
        }

    }

}
