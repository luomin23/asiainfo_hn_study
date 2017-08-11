package com.asiainfo.chapter1.dongwenchao.day10;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class jiben extends JPanel{
    JLabel noLabel;  //学号标签
    JLabel nameLabel;//姓名标签
    JLabel genderLabel;//性别标签
    JLabel birthLabel;//出生年月
    JLabel addressLabel;//家庭地址
    JLabel telLabel;//电话
    JTextField noField;//学号输入框
    JTextField nameField;
    JTextField genderField;
    JTextField birthField;
    JTextField addressField;
    JTextField telField;
    public jiben(){
        setGUIComponent();
    }
    private void setGUIComponent() {
        noLabel=new  JLabel("学号");
        noField=new JTextField(10);
        nameLabel=new JLabel("姓名");
        nameField=new JTextField(10);
        genderLabel=new JLabel("性别");
        genderField=new JTextField(10);
        birthLabel=new JLabel("出生年月");
        birthField=new JTextField(10);
        addressLabel=new JLabel("家庭住址");
        addressField=new JTextField(10);
        telLabel=new JLabel("联系电话");
        telField=new JTextField(10);
        this.setLayout(new GridLayout(3,4));//设置排序
        this.add(noLabel);
        this.add(noField);
        this.add(nameLabel);
        this.add(nameField);
        this.add(genderLabel);
        this.add(genderField);
        this.add(birthLabel);
        this.add(birthField);
        this.add(addressLabel);
        this.add(addressField);
        this.add(telLabel);
        this.add(telField);
        this.setVisible(true);
        this.setSize(300,300);
    }
    public void clearContent(){//清除文本框内容
        noField.setText("");
        nameField.setText("");
        genderField.setText("");
        birthField.setText("");
        addressField.setText("");
        telField.setText("");
    }
    public void setNo(String n){//设置学号文本框内容为n
        noField.setText(n);
    }
    public void setNames(String name){
        nameField.setText(name);
    }
    public void setGender(String gender){
        genderField.setText(gender);
    }
    public void setBirth(String birth){
        birthField.setText(birth);
    }
    public void setTel(String t){
        telField.setText(t);
    }
    public void setAddress(String a){
        addressField.setText(a);
    }
    public String getNo(){
        return noField.getText();
    }
    public String getNames(){
        return nameField.getText();
    }
    public String getGender(){
        return genderField.getText();
    }
    public String getBirth(){
        return birthField.getText();
    }
    public String getAddress(){
        return addressField.getText();
    }
    public String getTel(){
        return telField.getText();
    }
}
