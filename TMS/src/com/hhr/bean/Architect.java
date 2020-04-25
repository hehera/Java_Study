package com.hhr.bean;

/**
 * @author HHR
 * @date 2020/4/24 21:41
 */
public class Architect extends Designer{//架构师
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, int memberId, Status status, Equiment equiment, double bonus, int stock) {
        super(id, name, age, salary, memberId, status, equiment, bonus);
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, Equiment equiment, double bonus, int stock) {
        super(id, name, age, salary, equiment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getString()+"\t架构师\t"+getStatus()+"\t"+getBonus()+"\t"+getStock()+"\t"+getEquiment();
    }

}
