package com.hhr.bean;

/**
 * @author HHR
 * @date 2020/4/18 15:10
 */
public class Customer {
    private String name;
    private String sex;
    private String age;
    private String phone;
    private String email;

    public Customer() {
    }

    public Customer(String name, String sex, String age, String phone, String email) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo(){
        return name+"\t"+sex+"\t\t"+age+"\t\t"+phone+"\t\t"+email;
    }
}
