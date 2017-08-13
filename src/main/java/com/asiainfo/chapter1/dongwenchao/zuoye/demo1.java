package com.asiainfo.chapter1.dongwenchao.zuoye;

import java.io.Serializable;

/**
 * Created by 超超 on 2017/8/8 0008.
 */
    public class demo1 implements Serializable {
        private String Id;
        private String Name;
        private String Sex;
        private String Tel;

        public demo1()
        {
        }
        public demo1(String Id,String Name,String Sex,String Tel )
        {
            this.Id=Id;
            this.Name = Name;
            this.Sex=Sex;
            this.Tel=Tel;

        }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "demo1{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Tel='" + Tel + '\'' +
                '}';
    }
}

