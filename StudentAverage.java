//java program to display student average
/*file name:StudentAverage
date:23/08/2024
author:hemanth*/
import java.io.*;
import java.util.*;
public class StudentAverage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        double avg=(s1+s2+s3+s4+s5)/5.0;
        System.out.println("Average of the student is "+avg);
        if(avg>=80){
            System.out.println("Student passed with Distinction");
        }
        else if(avg>=70&&avg<80){
            System.out.println("Student passed in first class");
        }
        else if(avg>=50&&avg<70){
             System.out.println("student passed in second class");
        }
        else if(avg>=40&&avg<50){
             System.out.println("student passed in third class");
        }
        else{
             System.out.println("student failed");
        }
    }
}