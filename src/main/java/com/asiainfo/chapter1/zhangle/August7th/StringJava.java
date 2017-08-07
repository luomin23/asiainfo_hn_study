package com.asiainfo.chapter1.zhangle.August7th;

import java.util.StringTokenizer;

/**
 * Created by del on 2017/8/7.
 */
public class StringJava {

    /*构造方法
    * 1. StringTokenizer(String s)
    * 2. StringTokenizer(String s,String s1);
    * 3. StringTokenizer(String s,String s1,boolean return);
   * */
    public static void printString(StringTokenizer st){
        while(st.hasMoreElements()){
            System.out.println("输出："+st.nextToken());
        }
        System.out.println("- - - - - - - - -");

    }
    public static void string(){
        StringTokenizer st=null;
        String s="I/am/the.first";
        st=new StringTokenizer(s);
        printString(st);
        st=new StringTokenizer(s,".b");
        //. 作为分隔字符串
        printString(st);
        st=new StringTokenizer(s,"/",true);
        //为true的话则 /分割符也被视为标记 也要输出
        printString(st);
    }

    /*将字符串转为数组*/
    public String[] changeInt(){
        String[] sg;
        int i=0;
        StringTokenizer st=new StringTokenizer("sjksfj");
        sg=new String[st.countTokens()];  //动态的决定数组的长度
        while (st.hasMoreTokens()){
            sg[i]=st.nextToken();
            i++;
        }
        return sg;

    }
    /*输出数组*/
    public static void printAnalytical(String[] s){
        for(String st:s){
            System.out.println(st);
        }
        /*System.out.println();
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }*/

    }

    /*字符串解析*/
    public String[] stringAnalytical(String st,char c){
        int i=0;
        int sum=0;
        if(st.indexOf(c)==-1){
            //字符串不含分隔符的 返回字符本身
            return new String[]{st};
        }
        char[] cs = st.toCharArray();
        int length = cs.length;
        for (i = 1; i < length - 1; i++) {
            // 过滤掉第一个和最后一个是分隔符的情况
            if (cs[i] == c) {
                sum++;// 得到分隔符的个数
            }
        }
        String[] strArray = new String[sum + 1];
        int k = 0, j = 0;
        String str = st;
        if ((k = str.indexOf(c)) == 0)  // 去掉第一个字符是分隔符的情况
            str = str.substring(k + 1);
        if (str.indexOf(c) == -1)  // 检测是否含分隔符，如果不含则返回字符串
            return new String[] { str };
        while ((k = str.indexOf(c)) != -1) {
            // 字符串含分割符的时候
            strArray[j++] = str.substring(0, k);
            str = str.substring(k + 1);
            if ((k = str.indexOf(c)) == -1 && str.length() > 0)
                strArray[j++] = str.substring(0);
        }
        return strArray;

    }

    public static void main(String[] args) {
        string();
        StringJava sj=new StringJava();
        String[] s=sj.stringAnalytical("数组、12、35、10输出;",'、');
        printAnalytical(s);
        String[] s1=sj.stringAnalytical("12 15 20;",',');
        printAnalytical(s1);
        String[] s2=sj.changeInt();
        printAnalytical(s2);




    }
}
