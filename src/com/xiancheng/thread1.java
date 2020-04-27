package com.xiancheng;

/**
 * @author HHR
 * @date 2020/4/26 15:37
 */
public class thread1 {

    public static void main(String[] args) {
        MyThread my=new MyThread();

        my.start();

        for (int i = 0; i <100 ; i++) {
            System.out.println("main"+i);

        }


    }
}

