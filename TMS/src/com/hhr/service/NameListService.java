package com.hhr.service;

import com.hhr.bean.*;
import com.hhr.exception.TeamException;

import static com.hhr.utils.Data.*;

/**
 * @author HHR
 * @date 2020/4/24 21:59
 */
public class NameListService {
    private Employee[] all;//用来存取全公司员工

    public NameListService(){
        init();
    }
    //数据来源 DATA.java
    private void init(){
        //初始化all数组
        //(1)创建all数组,并指定长度
        all=new Employee[EMPLOYEES.length];
        //(2)遍历Data中EMPLOYEE的二维数组，并将其封装为一个个Employee，Programmer对象啊
        for (int i = 0; i < EMPLOYEES.length; i++) {
            int emType =Integer.parseInt(EMPLOYEES[i][0]);

            //数据转换

            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][2];
            int age=Integer.parseInt(EMPLOYEES[i][3]);
            int salary=Integer.parseInt(EMPLOYEES[i][4]);

            switch (emType){
                case EMPLOYEE:
                    all[i]=new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    all[i]=new Programmer(id,name,age,salary,getBylineNumber(i));
                    break;
                case DESIGNER:
                    double bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    all[i]=new Designer(id,name,age,salary,getBylineNumber(i),bonus);
                    break;
                case ARCHITECT:
                    bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    int stock =Integer.parseInt(EMPLOYEES[i][6]);
                    all[i]=new Architect(id,name,age,salary,getBylineNumber(i),bonus,stock);
                    break;
            }
        }
    }
    //读取i行设备类型
    private Equiment getBylineNumber(int i){
        //（1）读取设备的类型，即EQIPMENTS[i][0]
        int eType=Integer.parseInt(EQIPMENTS[i][0]);
        switch (eType){
            case PC:
                return new PC(EQIPMENTS[i][1],EQIPMENTS[i][2]);
            case NOTBOOK:
                return new Notebook(EQIPMENTS[i][1],Double.parseDouble(EQIPMENTS[i][2]));
            case PRINTER:
                return new Priter(EQIPMENTS[i][1],EQIPMENTS[i][2]);
        }
        return null;
    }

 //返回所有员工信息
    public Employee[] getAll(){
        return all;
    }

    //根据员工对象，获取员工对象
    public Employee getEmployeeById(int id) throws TeamException {
        for (int i = 0; i <all.length ; i++) {
            if(all[i].getId()==id)
            {
                return all[i];
            }
        }
        throw new TeamException(id+"员工id不存在");
    }
}
