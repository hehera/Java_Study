package com.hhr.bean;

/**
 * @author HHR
 * @date 2020/4/24 21:45
 */
public class PC implements Equiment{//接口的实现类
    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {//接口实现类 PC电脑
        this.display = display;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    @Override
    public String getDescription() {
        return model + "("+display+")";
    }
}
