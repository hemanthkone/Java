//java program to add two integers
/*file name:Addition3.java
date:16/08/2024
author:hemanth*/
import java.io.*;
import java.util.*;
public class Addition2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter two integers to add: ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("Sum of "+x+" and "+y+" is "+z);
    }
}
