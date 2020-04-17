package com.swap;



public class Test {
    public static void main(String[] args) {
        Swap_ s=new Swap_();
        s.a=1;
        s.b=2;
        System.out.println("a= "+s.a+",b= "+s.b);
        swap(s);
        System.out.println("a= "+s.a+",b= "+s.b);


    }
    public static void swap(Swap_ s){
        int temp ;
        temp=s.a;
        s.a=s.b;
        s.b=temp;


    }
}
