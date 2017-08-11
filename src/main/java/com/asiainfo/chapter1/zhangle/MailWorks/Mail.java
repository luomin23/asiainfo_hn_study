package com.asiainfo.chapter1.zhangle.MailWorks;

/**
 * Created by del on 2017/8/8.
 */
public class Mail {
    private int id;
    private String name;
    private String telephone;
    private String address;
    private String email;
    private  int born;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public Mail(){}
    public Mail(String telephone){
        this.telephone=telephone;

    }
    public Mail(int id, String name, String telephone, String address, String email, int born){
        this.id=id;
        this.name=name;
        this.telephone=telephone;
        this.address=address;
        this.email=email;
        this.born=born;
    }
}
