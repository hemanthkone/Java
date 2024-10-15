//java program to  demonstrate switch case
/*file name:SwitchDemo.java
date:23/08/2024
author:hemanth*/
import java.io.*;
import java.util.*;
public class SwitchDemo
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number from 0-5: ");
        int num=sc.nextInt();
        switch(num){
            case 0:
                System.out.println("You entered zero");
                break;
            case 1:
                System.out.println("You entered ONE");
                break;
            case 2:
                System.out.println("You entered TWO");
                break;
            case 3:
                System.out.println("You entered THREE");
                break;
            case 4:
                System.out.println("You entered FOUR");
                break;
            case 5:
                System.out.println("You entered FIVE");
                break;
            default:
            System.out.println("You entered invalid number");
            break;
        }
    }
}