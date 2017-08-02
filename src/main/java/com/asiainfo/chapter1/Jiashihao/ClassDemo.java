package src.main.java.com.asiainfo.chapter1.Jiashihao;

/**
 * Created by lenovo on 2017/7/31.
 */
class Person6{
    //定义Person6类
    private String name;
    //定义name属性
    private int age;
    //定义age属性
    public String getName(){
        //取得name属性
        return name;
    }
    public void setName(String name){
        //设置name属性
        this.name=name;
    }
    public int getAge(){
        //取得age属性
        return age;
    }
    public void setAge(int age){
        //设置age属性
        this.age=age;
    }
    public String toString(){
        //覆盖toString()方法
        return"姓名："+this.name+",年龄："+this.age;
    }
}
public class ClassDemo {
    public static void main(String[] args){
        Class<?> c = null;
        //制定泛型
        try{
            c = Class.forName( "com.asiainfo.chapter1.Jiashihao.JDK.Person6");
            //传入要实例化类的完整包.类名称
        }catch
            (ClassNotFoundException e){
                e.printStackTrace();
            }
            Person6 per = null;
        //声明Person对象
            try{
                per = (Person6) c.newInstance();
                //实例化Person对象
            }catch(Exception e){
                e.printStackTrace();
            }
            per.setName("JSH");
        //设置姓名
            per.setAge(23);
        //设置年龄
            System.out.println(per);
        //内容输出，调用toString()
        }
    }

