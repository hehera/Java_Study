package com.gouzao;
//创建学生对象
class Student {
    //属性
    private String name ;
    private  int grade;
    private  String id;

    //构造方法
    //无参构造，创建对象时会自动创建
    public Student(){

    }
    public Student(String n,int g,String i){
        name=n;
        grade=g;
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String printinfo(){
        return "name="+name+"grade="+grade+"id="+id;
    }
}
