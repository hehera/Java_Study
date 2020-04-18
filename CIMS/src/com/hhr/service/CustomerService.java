package com.hhr.service;

import com.hhr.bean.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HHR
 * @date 2020/4/18 15:20
 */
public class CustomerService{
    private Customer[] all;
    private int total;
    Scanner input=new Scanner(System.in);
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public CustomerService() {
        all=new Customer[10];
    }

    public CustomerService(int initSize) {
        all=new Customer[initSize];
    }

    public void addCustomer(Customer c){

        if(total>=all.length) {
            System.out.println("客户已满");
            return;
        }
        else {
            System.out.println("添加完成!");
        }

        all[total++]=c;
    }
    //返回所有已经存储对象
    public Customer[] getAll(){
      /*  Customer[] result =new Customer[total];
        for (int i = 0; i <total ; i++) {
            result[i]=all[i];
        }
       */
        return Arrays.copyOf(all,total);

    }
    //删除存储客户对象
    public void removeByid(int id){
        int index=id-1;
        if (index<0||index>=total){
            System.out.println("输入的客户id不存在");
            return;
        }
        System.arraycopy(all,index+1,all,index,total-index-1);
        all[--total]=null;
    }

//获取ID修改客户对象
    public void getCustomerId(int id) throws IOException {
        int index=id-1;
        if (index<0||index>=total){
            System.out.println("输入的客户id不存在");
            return;
        }

        System.out.print("姓名"+"("+all[index].getName()+")");
        //String name=input.nextLine();
        String name=bf.readLine();
        if(name.length()!=0)
        {
            all[index].setName(name);
        }


        System.out.print("性别"+"("+all[index].getSex()+")");
        String sex=bf.readLine();
        if(sex.equals("男")||sex.equals("女"))
        {
            all[index].setSex(sex);
        }


        System.out.print("年龄"+"("+all[index].getAge()+")");
        String age=bf.readLine();
        if(age.length()!=0)
        {
            all[index].setAge(age);
        }



        System.out.print("电话"+"("+all[index].getPhone()+")");
        String phone=bf.readLine();
        if(phone.length() == 11)
        {
            all[index].setPhone(phone);
        }


        System.out.print("邮箱"+"("+all[index].getEmail()+")");
        String email=bf.readLine();
        if(email.length()<33&&email.length()>=5)
        {
            all[index].setEmail(email);
        }

    }

}
