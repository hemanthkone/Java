//java program to demonstrate the given integer is even or odd
/*file name : EvenOdd.java
date:30/08/2024
author : hemanth*/
import java.io.*;
import java.util.*;
public class EvenOdd extends Object{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer to check Even or Odd: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is even integer ");
        }
        else{
            System.out.println(num+" is an odd integer");
        }
    }
}
