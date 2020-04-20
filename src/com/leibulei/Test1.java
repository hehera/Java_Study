package com.leibulei;

/**
 * @author HHR
 * @date 2020/4/20 20:59
 */
public class Test1 {
    public static void main(String[] args) {
        new Father(){

            @Override
            public void method() {
                System.out.println("为了未来");
            }
        }.method();
    }
}
abstract class Father{
    public abstract void method();
}
