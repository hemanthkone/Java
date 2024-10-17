//java program to demonstrate  dynamic method dispatch in java 
/* 
file name:Splender.java
date;17/09/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
class Bike{
    void run(){
        System.out.println("Bike is running ");
    }
}
public class Splender extends Bike{
    void run(){
        System.out.println("Splender bike is running with 60 kmph");
    }
    public static void main(String args[]){
        Splender s=new Splender();
        s.run();
        Bike b1=new Bike();
        b1.run();
        Bike b2=new Splender();
        b2.run();
    }
}
