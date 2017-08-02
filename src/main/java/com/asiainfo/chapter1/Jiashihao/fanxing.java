package src.main.java.com.asiainfo.chapter1.Jiashihao;

/**
 * Created by lenovo on 2017/8/1.
 */
class Point<T>{
    private T var;
    public Point(T var){
        this.var = var;
    }
    public T getVar(){
        return var;
    }
    public void setVar(T var){
        this.var = var;
    }
};
public class fanxing {
    public static void main(String[] args){
     Point<String> p = null;
        p = new Point<String>("JSH");
        System.out.println("内容："+p.getVar());





    }
}
