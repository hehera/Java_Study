package com.jiekou;

/**
 * @author HHR
 * @date 2020/4/19 19:49
 */
public class Test {
    public static void main(String[] args) {
        MyRunnable[] all=new MyRunnable[5];
        all[0]=new Car();
        all[1]=new Car();
        all[2]=new Car();
        all[3]=new Person();
        all[4]=new Dog();
        for (int i = 0; i <all.length ; i++) {
            all[i].run();
        }
    }
}
