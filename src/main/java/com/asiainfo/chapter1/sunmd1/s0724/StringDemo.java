package com.asiainfo.chapter1.sunmd1.s0724;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


/**
 * Created by Administrator on 2017/7/24 0024.
 * 1.基本数据类型转字符串
 * 2.字符串转基本类型
 * 3.时间类型与字符串的转换
 * 4.String类的常用方法
 * 5.StringBuffer类的使用
 */
public class StringDemo {

    public static void main(String[] args){
        toStringTest();
        ToBasicTypeTest();
        dateFormatTest();
        stringTest();
        stringBuilderTest();
    }

    /**
     * 1.基本数据类型转字符串
     * n+""
     * Obj.toString(n)
     * String.valueOf(n)
     */


    public static void toStringTest(){
        double n = 2.5;
        System.out.println((n+"").getClass());
        System.out.println(Double.toString(n).getClass());
        System.out.println(String.valueOf(n).getClass());
    }

    /**
     *  2.字符串转基本类型
     *  Obj.parseXX(str)
     *  Obj.valueOf(str)
     *
     */


    public static  void ToBasicTypeTest(){
        String str = "666";
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.valueOf(str));
    }

    /**
     * 3.时间类型与字符串的转换
     */


    public static void dateFormatTest(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String format()
        System.out.println( sdf.format(date));

        String str = "2017年7月24日";
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
        try {
            //Date parse()
           Date dt =  f.parse(str);
            System.out.println(dt);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }




    /**
     *  4.String类的常用方法
     */

    public static void stringTest(){
        String str = new String(" afsv fsfs fdkd jfoiwe ");
        System.out.println("字符串长度："+str.length());
        System.out.println("字符s第一次出现的位置："+str.indexOf('s'));
        System.out.println("子字符串fdk第一次出现的位置："+str.indexOf("fdk"));
        System.out.println("最后一次出现f的位置："+str.lastIndexOf('f'));
        System.out.println("从3位置到最后的字符串"+str.substring(3));
        System.out.println(str.equals(" afsv fsfs fdkd jfoiwe "));
        System.out.println("将字符串改成大写："+str.toUpperCase());
        System.out.println("获取10位置上的字符："+str.charAt(10));
        String[] arr = str.split(" ");//按空格把字符串拆分成数组
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        byte[] bArr = str.getBytes();
        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(str.trim().getBytes()));
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入java文件名");
		String str1 = scanner.next();
		//判断文件名是否合理
		//获取.的位置
		int x =str1.indexOf(".java");//是否存在.java字符串
		int y =str1.lastIndexOf(".java");//最后一次出现的位置
		//第一位上是不是.
		if(x!=-1 && y==str1.length()-5 && str1.charAt(0)!='.'){
			System.out.println(str1+"文件名合理");
		}else{
			System.out.println(str1+"文件名不合理");

		}
		//判断邮箱是否合格
		//存在@和.并且@在.前
		System.out.println("输入邮箱名");
		String str2 = scanner.next();
		int a = str2.indexOf('@');
		int b = str2.indexOf('.');
		if(a!=-1 && b!=-1 && a<b){
			System.out.println(str2+"邮箱名合理");
		}else{
			System.out.println(str2+"邮箱名不合理");

		}

    }


    /**
     * 5.StringBuffer类的使用
     */

    public static void stringBuilderTest(){
        StringBuilder sb = new StringBuilder("好好学习");
        sb.append("天天向上");
        sb.toString();
        System.out.println(sb);
        sb.insert(4,'!');
        System.out.println(sb);
        System.out.println(sb.length());
    }




}
