//java program to search array elements
/* 
file name:ArrSearch.java
date;14/09/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
public class ArrSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int pos=0;
            System.out.println("Enter no of elements in the array ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter "+n+" values: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the key element to search ");
            int key = sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i]==key){
                    pos = i+1;
                    break;
                }
            }
            if(pos>=n+1){
                 System.out.println(key+"is not found");
            }
            else{
                 System.out.println(key+" is found at "+pos);
            }
    }
}
