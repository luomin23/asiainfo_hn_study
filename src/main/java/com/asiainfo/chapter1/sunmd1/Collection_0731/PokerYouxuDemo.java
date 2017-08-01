package com.asiainfo.chapter1.sunmd1.Collection_0731;

import java.util.*;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 功能：发的牌有序
 * 思路：map存牌（key,pai）,key存在arraylist，
 * 洗编号，发编号，用set接牌（有序），根据key，从map获取牌
 *
 */
public class PokerYouxuDemo {
    //存牌：编号：key,牌：value
    private Map<Integer,String> map = new HashMap<Integer, String>();
    //存编号key
    private ArrayList<Integer> array = new ArrayList<Integer>();

    //装牌
    private String[] tuan = {"♥","♠","♦","♣"};
    private String[] pai = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

    public void doudizhu(){
        //装牌
        int index = 0;
        for(String p : pai){
            for(String t : tuan){
                map.put(index,t+p);
                array.add(index);
                index++;
            }
        }
        map.put(index,"小王");
        array.add(index);
        index++;
        map.put(index,"大王");
        array.add(index);

        //洗牌-------洗编号，发编号
        Collections.shuffle(array);

        //发牌
        TreeSet<Integer> huge = new TreeSet<Integer>();
        TreeSet<Integer> pengyuyan = new TreeSet<Integer>();
        TreeSet<Integer> yuanhong = new TreeSet<Integer>();
        TreeSet<Integer> dipai = new TreeSet<Integer>();

        for(int i = 0;i<array.size();i++){
            if(i>=array.size()-3){
                dipai.add(array.get(i));
            }else if(i%3==0){
                huge.add(array.get(i));
            }else if(i%3==1){
                pengyuyan.add(array.get(i));
            }else
                yuanhong.add(array.get(i));
        }

        //看牌
        lookpai("胡歌",huge,map);
        lookpai("彭于晏",pengyuyan, map);
        lookpai("袁弘",yuanhong, map);
        lookpai("底牌",dipai, map);

    }

    private void lookpai(String s, TreeSet<Integer> set, Map<Integer, String> map) {
        System.out.println(s+"的牌是：");
        for(int key : set){
            System.out.print(this.map.get(key)+" ,");
        }

    }

}
