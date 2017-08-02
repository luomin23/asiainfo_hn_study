package src.main.java.com.asiainfo.chapter1.Jiashihao;


/**
 * Created by lenovo on 2017/7/31.
 */
class Person7{
    private String name;
    private int age;
    public Person7(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        //此处覆写toString方法
        return "姓名："+ this.name+",年龄："+this.age;
    }
}
public class ObjectDemo {
    public static void main(String agrs[]){
        Person7 per = new Person7("JSH",23);
        //实例化Person7对象
        System.out.println("对象信息："+ per);
        //打印对象调用toString（）方法
    }
}
