package com.asiainfo.chapter1.wangjz.java.javaday1.javaday5;

/**
 * Created by wjz123456 on 2017/7/28.
 */
public class TryCatchFinally {

    private int age;

    public static void main(String[] args) throws Exception {
        TryCatchFinally s=new TryCatchFinally();
        s.set(200);
int a[]=new int[]{1,2,3,4,5};
        for (int i=0;i<7;i++){
            try{
                System.out.print(a[i]);
            }catch(ArrayIndexOutOfBoundsException e){ //捕获异常并处理
                System.out.println("数组下标越界");
                System.out.println(e);
            }finally {
                System.out.println("i="+i);
            }
        }

    }
    public void set(int age) throws Exception {
        if(age<120 && age>0){
            this.age=age;
        }else {

           // throw new Exception("IllegalAgeDate");
        }
    }
}
