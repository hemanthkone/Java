//java program to invoking a parent class constructor by using super keyword
/* 
file name:SuperDemo1.java
date;17/09/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is created");
    }
}
public class SuperDemo1{
    public static void main(String args[]){
        Animal a=new Animal();
        Dog d=new Dog();
    }
}
