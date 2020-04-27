package com.danlianbiao;

import java.util.Arrays;

/**
 * @author HHR
 * @date 2020/4/27 17:30
 */
public class Test {
    public static void main(String[] args) {
        SingleList list=new SingleList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        System.out.println("链表长度"+list.size());

        System.out.println("获取所有元素"+ Arrays.toString((Object[]) list.getAll()));

        /*删除的第一种方法测试
        int i=3;
        System.out.println("删除第"+i+"个元素");
        list.remove(i);
        */

        //删除的第二种方法测试
        list.remove("王五");

        System.out.println("获取所有元素"+Arrays.toString((Object[]) list.getAll()));
    }
}
