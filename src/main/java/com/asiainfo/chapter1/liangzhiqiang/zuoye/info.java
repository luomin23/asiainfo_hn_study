package com.asiainfo.chapter1.liangzhiqiang.zuoye;

/**
 * Created by 君不悔 on 2017/8/12.
 */
public class info extends UDPServer {
    private String Age;
    private String Name;
    private  String Email;
    private String Add;
    private String Tel;

    public info()
    {
    }
    public info(String Age, String Name, String Add, String Tel, String Email  )
    {
        this.Age=Age;
        this.Name = Name;
        this.Add=Add;
        this.Tel=Tel;
        this.Email=Email;

    }


    public String getAge() {
        return Age;
    }

    public void setId(String age) {
        Age = age;
    }

    public String getEmail() {

        return Email;
    }

    public void setEmail(String email) {
        Email= email;
    }

    public String getTel() {

        return Tel;
    }

    public void setTel(String tel) {

        Tel = tel;
    }

    public String getAdd() {
        return Add;
    }

    public void setAdd(String add) {
        Add = add;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }


    public String toString() {
        return "Info{" + "Age='" + Age + '\'' +
                ", Name='" + Name + '\'' +
                ", Add='" + Add + '\'' +
                ", Tel='" + Tel + '\'' +
                "Email'"+Email+'\''+
                '}';
    }
}
