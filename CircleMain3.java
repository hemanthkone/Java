//java program to find area of a circle , Encapsulation , multiple objects , multiple methods , method invoking using this keyword
/*
file name:CircleMain3.java
date:21/08/2024
author: hemanth
*/
import java.io.*;
import java.util.*;
class Circle{
    double r;
    double area(){
        return((22/7.0)*r*r);
}
void SetCircle(double r){
    this.r=r;
}
}
public class CircleMain3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Circle c1=new Circle();
        Circle c2=new Circle();
        System.out.println("Enter radius of two circles: ");
        double radius1=sc.nextDouble();
        double radius2=sc.nextDouble();
        c1.SetCircle(radius1);
        c2.SetCircle(radius2);
         System.out.println("Area of first circle is: "+c1.area());
          System.out.println("Area of second circle is : "+c2.area());
    }
}
