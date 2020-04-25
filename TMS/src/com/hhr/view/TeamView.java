package com.hhr.view;

import com.hhr.bean.Employee;
import com.hhr.bean.Programmer;
import com.hhr.exception.TeamException;
import com.hhr.service.NameListService;
import com.hhr.service.Teamservice;

import java.util.Scanner;

/**
 * @author HHR
 * @date 2020/4/25 17:06
 */
public class TeamView {
    Scanner input=new Scanner(System.in);
    private   NameListService ns=new NameListService();
    private Teamservice ts=new Teamservice();
    public void menu(){
        while(true){
            System.out.println("--------------------------------开发团队调度系统-------------------------------");
            getAllEmployee();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1.团队列表");
            System.out.println("2.添加团队成员");
            System.out.println("3.删除团队成员");
            System.out.println("4.退出");
            System.out.print("请选择1-4---->");
            //键盘输入

            String select=input.next();
            if(select.equals("1")||select.equals("2")||select.equals("3")||select.equals("4")) {

                switch (select) {
                    case "1":
                        list();
                        break;
                    case "2":
                        add();
                        break;
                    case "3":
                        remove();
                        break;
                    case "4":
                        System.out.print("确认是否退出（Y/N）");
                        String exit = input.next();
                        if (exit.equals("Y")) {
                            return;
                        } else if (!exit.equals("N")) {
                            System.out.println("输入错误，请重新输入");
                        }

                }
            }
            else{
                System.out.println("输入有误，请重新输入");
            }
            System.out.println("----------------------------------------------------------------------------");

        }



    }

    public void add(){
        System.out.println("------------------------------添加成员-----------------------------");
        System.out.print("请输入添加员工的ID=");

        int id=input.nextInt();


        try{
            Employee emp= ns.getEmployeeById(id);

            ts.addMember(emp);
        }catch (TeamException e){
            System.out.println("添加失败"+e.getMessage());
        }


    }

    public void remove(){
        System.out.println("------------------------------删除成员-----------------------------");
        System.out.print("请输入要删除员工的ID=");
        while(true) {
            int tid = input.nextInt();
            System.out.print("确认是否删除（Y/N）");
            String del = input.next();
            if (del.equals("N")) {
                System.out.println("删除取消");
                return;
            } else if (del.equals("Y")) {
                try {
                    ts.removeMemberByTid(tid);
                    System.out.println("删除成功");
                    break;
                } catch (TeamException e) {
                    System.out.println("删除原因" + e.getMessage());
                    break;
                }
            } else {
                System.out.println("输入有误，请重新输入");
            }
        }
    }


    public void list(){
        System.out.println("------------------------------打印成员-----------------------------");
        System.out.println("TID|ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        int j=1;
        Programmer[] allMembers=ts.getAllMembers();
        for (int i = 0; i <allMembers.length ; i++) {
            System.out.println("  "+(j++)+"|"+allMembers[i]);
        }
    }


    private void getAllEmployee(){
        System.out.println("ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        //(1)获取员工信息

        Employee[] all =ns.getAll();
        //（2）遍历
        for (int i = 0; i <all.length ; i++) {
            System.out.println(all[i]);
        }
    }
}
