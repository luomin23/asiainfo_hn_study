package src.main.java.com.asiainfo.chapter1.Jiashihao;


/**
 * Created by lenovo on 2017/7/31.
 */
public class StringDemo {
    public static void main(String[] args){
        String str3 = "hello";
        String str4 = new String("hello");
        String str5 = str4;
        System.out.println("str3 == str4 -->" + (str3 == str4));
        System.out.println("str3 == str5 -->" + (str3 == str5));
        System.out.println("str4 == str5 -->" + (str4 == str5));
    }
}
