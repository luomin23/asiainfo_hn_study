package com.asiainfo.chapter1.zhangle.MailWorks;

/**
 * Created by del on 2017/8/8.
 */
public class Mail {
    private String name;
    private String telephone;
    private String address;
    private String email;
    private  String born;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public Mail(){}
    public Mail(String telephone){
        this.telephone=telephone;

    }
    public Mail(String name, String telephone, String address, String email, String born){
       this.name=name;
        this.telephone=telephone;
        this.address=address;
        this.email=email;
        this.born=born;
    }
}
