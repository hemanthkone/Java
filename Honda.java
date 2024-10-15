//java program to demonstrate abstract keyword
/*file name:Honda.java
date:20/09/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
abstract class Bike{
    abstract void run();
}
public class Honda extends Bike{
    void run(){
        System.out.println("Honda bike is running");
    }
    public static void main(String args[]){
        Bike ob=new Honda();
        ob.run();
    }
}
