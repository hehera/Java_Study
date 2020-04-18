package com.hhr.view;

import com.hhr.bean.Customer;
import com.hhr.service.CustomerService;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author HHR
 * @date 2020/4/18 14:16
 */
public class CustomerView {
    CustomerService cs=new CustomerService();
    Scanner input=new Scanner(System.in);

    public void menu() throws IOException {
        while (true) {
            System.out.println("----------------------客户信息管理软件----------------------");
            System.out.println("\t\t\t\t\t\t1.添加用户");
            System.out.println("\t\t\t\t\t\t2.修改用户");
            System.out.println("\t\t\t\t\t\t3.删除用户");
            System.out.println("\t\t\t\t\t\t4.客户列表");
            System.out.println("\t\t\t\t\t\t5.退    出");
            System.out.println("请选择1-5：");

            String select =  input.next();
            if(!select.equals("1")&&!select.equals("2")&&!select.equals("3")&&!select.equals("4")&&!select.equals("5"))
            {
                System.out.println("输入有误，请重新输入");
                menu();

            }
            switch (select) {
                case "1":
                    add();
                    break;
                case "2":
                    update();
                    break;
                case "3":
                    delete();
                    break;
                case "4":
                    list();
                    break;
                case "5":
                    System.out.println("确认是否退出：Y->是，N->否");
                    String end = input.next();
                        if (end.equals("Y")) {
                            return;
                        }
            }
        }

    }

    private void list() throws IOException {
        Customer[] all=cs.getAll();
        System.out.println("----------------------客户信息列表----------------------");
        System.out.println("---编号"+"\t"+"姓名"+"\t"+"性别"+"\t"+"年龄"+"\t\t"+"电话"+"\t\t"+"邮箱---");

        for (int i = 0; i <all.length ; i++) {
            System.out.println("\t"+(i+1)+"\t"+all[i].getInfo());
        }
        System.out.println();
        System.out.println();
        System.out.println("本客户信息管理系统共存储"+all.length+"位客户");
        System.out.println("--------------------客户信息输出完毕--------------------");
        System.out.println();
        System.out.println();
        System.out.println();

    }

    private void delete()  {
        System.out.println("----------------------客户信息删除----------------------");
        System.out.println("请输入要删除的客户编号");
        System.out.println("注：-1 退出");
        int id=input.nextInt();

        if(id==-1)
        {
            return;
        }
        System.out.println("确认是否删除：Y->是，N->否");
        String confirm=input.next();
        if (confirm.equals("N"))
        {
            return;
        }
        //删除
        cs.removeByid(id);
        System.out.println("删除成功");

    }
    //修改
    private void update() throws IOException {
        System.out.println("----------------------修改用户----------------------");
        System.out.println("请输入要修改的客户编号");
        System.out.println("注：-1 退出");
        int id=input.nextInt();

        if(id==-1)
        {
            return;
        }
        System.out.println("如果不想修改则可以输入 空格 再 回车 结束");
        cs.getCustomerId(id);
        System.out.println("确认是否修改：Y->是，N->否");
        String confirm=input.next();
        if (confirm.equals("N"))
        {
            return;
        }

    }

    private void add() throws IOException {

        System.out.println("----------------------添加用户----------------------");
        System.out.print("\t姓名：");
            String name =input.next();
        System.out.print("\t性别：");
        String sex = input.next();
        while(true) {

            if (!sex.equals("男") && !sex.equals("女")) {
                System.out.println("输入有误，请重新输入");
                System.out.print("\t性别：");
                sex = input.next();
            }
            else{
                break;
            }
        }
        System.out.print("\t年龄：");
            String age = input.next();
        System.out.print("\t电话：");
        String phone = input.next();
        while(true) {
            if (phone.length()!=11) {
                System.out.println("输入有误，请重新输入");
                System.out.print("\t电话：");
                phone = input.next();
            }
            else{
                break;
            }
        }

        System.out.print("\t邮箱：");
        String email = input.next();
        while(true) {
            if (email.length()>33) {
                System.out.println("输入有误，请重新输入");
                System.out.print("\t邮箱：");
                email = input.next();
            }
            else{
                break;
            }
        }
        Customer customer=new Customer(name,sex,age,phone,email);


        cs.addCustomer(customer);
    }
}

