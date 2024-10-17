//java program to demonstrate method overriding , dynamic method , dispatch in java 
/* 
file name:Honda2.java
date;04/09/2024
author:hemanth
*/
import java.io.*;
class Bike{
    void run(){
        System.out.println("Bike is running ");
    }
}
public class Honda2 extends Bike{
    void run(){
        System.out.println("Honda bike is running");
    }
    public static void main(String args[]){
        Honda2 h=new Honda2();
        h.run();
        Bike b1=new Bike();
        b1.run();
        Bike b2=new Honda2();
        b2.run();
    }
}
