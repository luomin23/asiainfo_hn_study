package com.asiainfo.chapter1.dongwenchao.day03;

/**
 * Created by 超超 on 2017/7/26 0026.
 */
public class demo1 {
   /* private String name;
    private String sex;
    private int sid;*/

    /*public demo7(String 姓名, String 性别, int 学号) {
        name= 姓名;
        sex=性别;
        sid=学号;*/
/*        System .out.println("姓名："+name +"\n" +"性别："+ sex+"\n" + "学号：" + sid );
    }
    public static void main (String[] args){
        demo7 a= new demo7("董稳超" ,"男",6);
    }*/
    private int sid1;
    public demo1 (String name){

        System.out.println("我的名字是："+ name);
    }
    public void setAge(int age){
        sid1=age;
    }
    public int getAge( ){
        System.out.println("我的年龄为 : " + sid1 );
        return sid1;
    }
    public static void main(String []args){
        demo1 myPuppy = new demo1( "董稳超" );
      /* 通过方法来设定age */
        myPuppy.setAge( 21 );
      /* 调用另一个方法获取age */
        myPuppy.getAge( );
      /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.sid1 );
    }
}
