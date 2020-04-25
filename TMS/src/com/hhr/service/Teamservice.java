package com.hhr.service;

import com.hhr.bean.*;
import com.hhr.exception.TeamException;

import java.util.Arrays;

/**
 * @author HHR
 * @date 2020/4/25 19:06
 */
public class Teamservice {
    private Programmer[] team;//用来装开发团队成员
    private int total;
    private static final int MAX_TEAM=5;
    private int currentId =1;
    public Teamservice(){
        team=new Programmer[MAX_TEAM];
    }
    public void addMember(Employee emp) throws TeamException {

        //(1)判断人数
        if(total>=MAX_TEAM) {
            throw new TeamException("成员已满，无法添加");
        }
        //(2)判断是否程序员或子类的对象
        if(!(emp instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        //（3）判断状态
        Programmer p=(Programmer) emp;
        switch(p.getStatus()){
            case BUSY:
                throw new TeamException("该成员已经式团队成员");
            case VACATION:
                throw new TeamException("该成员正在休假，无法添加");
        }
        //(4)判断每一种人的人数
        //现在统计当前team中的每一个类型的对象人数
        int pCount=0;//程序员人数
        int dCount=0;//设计师人数
        int aCount=0;//架构师人数

        //这里用total,有几个人数统计几个人
        for (int i = 0; i <total ; i++) {
            if(team[i] instanceof Architect){
                aCount++;
            }else if (team[i] instanceof Designer){
                dCount++;
            }else{
                pCount++;
            }
        }
        //emp-->是架构师，看看够不够
        //emp-->是设计师，看看够不够
        //emp-->是程序员，看看够不够
        if(emp instanceof Architect){
            if (aCount>=1) {
                throw new TeamException("团队中只有一名架构师");
            }
        }else if (emp instanceof Designer){
                if(dCount >=2){
                    throw new TeamException("团队只能有两名设计师");
                }
        }else{
                if(pCount>=3)
                {
                    throw new TeamException("团队中只能有三名程序员");
                }
        }
        //(5)可以正常添加
        p.setStatus(Status.BUSY);

        p.setMemberId(currentId++);
        team[total++]=p;

    }

    public Programmer[] getAllMembers(){
        return Arrays.copyOf(team,total);
    }


    //根据团队编号删除队友
    public void removeMemberByTid(int tid) throws TeamException {
        int index=-1;
        for (int i = 0; i <total ; i++) {
            if(team[i].getMemberId()==tid)
            {
                index=i;
                break;
            }
        }
        if (index==-1){
            throw new TeamException(tid+"号团队成员不存在");
        }
        team[index].setStatus(Status.FREE);
        team[index].setMemberId(0);

        System.arraycopy(team,index+1,team,index,total-index-1);
        team[total-1]=null;
    }
}
