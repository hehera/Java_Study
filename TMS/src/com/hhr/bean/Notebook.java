package com.hhr.bean;

/**
 * @author HHR
 * @date 2020/4/24 21:49
 */
public class Notebook implements Equiment{//接口实现类 笔记本
    private String model;
    private double price;

    public Notebook() {
    }

    public Notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    @Override
    public String getDescription() {
        return model + "("+price+")";
    }
}
