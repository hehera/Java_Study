package com.hhr.bean;

/**
 * @author HHR
 * @date 2020/4/24 21:31
 */
public class Programmer extends Employee {//继承员工类  程序员
    private  int memberId;
    private Status status=Status.FREE;
    private Equiment equiment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, int memberId, Status status, Equiment equiment) {
        super(id, name, age, salary);
        this.memberId = memberId;
        this.status = status;
        this.equiment = equiment;
    }

    public Programmer(int id, String name, int age, double salary, Equiment equiment) {
        super(id, name, age, salary);
        this.equiment = equiment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equiment getEquiment() {
        return equiment;
    }

    public void setEquiment(Equiment equiment) {
        this.equiment = equiment;
    }

    @Override
    public String toString() {
        return getString()+"\t程序员"+"\t"+status+"\t\t\t\t\t"+equiment;
    }
}
