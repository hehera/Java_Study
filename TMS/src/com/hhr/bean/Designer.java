package com.hhr.bean;

/**
 * @author HHR
 * @date 2020/4/24 21:39
 */
public class Designer extends Programmer{//继承程序员 设计者类
    private  double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, int memberId, Status status, Equiment equiment, double bonus) {
        super(id, name, age, salary, memberId, status, equiment);
        this.bonus = bonus;
    }

    public Designer(int id, String name, int age, double salary, Equiment equiment, double bonus) {
        super(id, name, age, salary, equiment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getString()+"\t设计师\t"+getStatus()+"\t"+bonus+"\t\t\t"+getEquiment();
    }
}
