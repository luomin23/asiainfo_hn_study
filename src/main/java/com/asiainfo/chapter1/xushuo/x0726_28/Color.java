package com.asiainfo.chapter1.xushuo.x0726_28;

/**
 * Created by root on 2017/7/27.
 * 枚举
 */
public enum Color {
    RED("红色",1),GREEN("绿色",2),BLANK("白色",3),YeLLO("黄色",4);
    private String name;
    private int index;
    private Color(String name , int index) {
        this.name=name;
        this.index=index;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index=index;
    }

    /**
     * Created by root on 2017/7/27.
     * 枚举
     */
    public static class Color2 {
        public static void main(String[] args) {
            //输出某一枚举的值
            System.out.println(RED.getName());
            System.out.println(RED.getIndex());
            //遍历所有的枚举
            for(Color color : values()){
                /*枚举：values()表示得到全部的枚举内容，然后以对象数组的形式用foreach输出*/
//                foreach语句为数组或对象集合中的每个元素重复一个嵌入语句组。
//                foreach语句用于循环访问集合以获取所需信息，
//                但不能用于更改集合内容以避免产生不可预知的副作用
                System.out.println(color +" name:"+color.getName()+" index:"+color.getIndex());
            }
        }
    }
}
