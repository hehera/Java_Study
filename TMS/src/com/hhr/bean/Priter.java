package com.hhr.bean;

/**
 * @author HHR
 * @date 2020/4/24 21:51
 */
public class Priter implements Equiment {//接口实现类 打印机
    private String type;
    private String name;

    public Priter() {
    }

    public Priter(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    @Override
    public String getDescription() {
        return type + "("+name+")";
    }
}
