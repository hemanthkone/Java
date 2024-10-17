//java program to demonstrate  dynamic method dispatch in java 
/* 
file name:WhoAmI.java
date;17/09/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
class A{
    void callMe(){
        System.out.println("I am from class A");
    }
}
class B extends A{
    void callMe(){
        System.out.println("I am from class B");
    }
}
public class WhoAmI{
    public static void main(String args[]){
        A a=new A();
        a.callMe();
        B b=new B();
        b.callMe();
        A a1=new A();
        a1.callMe();
    }
}
