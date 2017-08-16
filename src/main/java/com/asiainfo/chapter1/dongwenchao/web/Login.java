package com.asiainfo.chapter1.dongwenchao.web;

/**
 * Created by 超超 on 2017/8/15 0015.
 */
public class Login {
    private String user;
    private String pass;
    public Login(){
    }

    public String getUser() {
        try {
          byte b []=user.getBytes("ISO-8859-1");
            user=new String(b,"UTF-8");

        return user;
        }catch (Exception e){
            return user;
        }
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        try {
            byte b []=pass.getBytes("ISO-8859-1");
            pass=new String(b,"UTF-8");
            return pass;
        }catch (Exception e){
            return pass;
        }
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
