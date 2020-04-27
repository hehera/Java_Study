package com.xiancheng;

/**
 * @author HHR
 * @date 2020/4/27 20:34
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("线程1:"+i);
        }
    }
}
