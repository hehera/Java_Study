package com.gouzao;

public class Test {
    public static void main(String[] args) {
        //无参构造声明对象
        Student s1=new Student();

        s1.setName("张三");
        s1.setGrade(78);
        s1.setId("234253");
        System.out.println(s1.printinfo());

        //有参构造声明对象
        Student s2=new Student("李四",90,"234242");
        System.out.println(s1.printinfo());
    }
}
