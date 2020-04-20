package com.leibulei;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author HHR
 * @date 2020/4/20 21:03
 */
public class Test {
    public static void main(String[] args) {
        Employee[] all=new Employee[3];
        all[0]=new Employee(1,"张三",3000);
        all[1]=new Employee(3,"李四",5000);
        all[2]=new Employee(2,"王五",2000);
        Arrays.sort(all, new Comparator<Employee>() {//按id大小排序
            @Override
            public int compare(Employee o1, Employee o2) {
                Employee e1=(Employee)o1;
                Employee e2=(Employee)o2;
                return e1.getId()-e2.getId();
            }
        });
        for (int i = 0; i <all.length ; i++) {
            System.out.println(all[i]);
        }

        Arrays.sort(all, new Comparator<Employee>() {//按薪资排序
            @Override
            public int compare(Employee o1, Employee o2) {
                Employee e1=(Employee)o1;
                Employee e2=(Employee)o2;
                return e1.getSalary()-e2.getSalary();
            }
        });
        for (int i = 0; i <all.length ; i++) {
            System.out.println(all[i]);
        }
    }
}
