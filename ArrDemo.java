//java program to print array elements
/* 
file name:ArrDemo.java
date;13/09/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
public class ArrDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of elements in the array ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter "+n+" values: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("The values in the array are ");
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
            }
    }
}
