//java program to find area of a circle , Encapsulation , multiple objects , multiple methods , method invoking using this keyword
/*
file name:CircleMain2.java
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
void SetCircle(double c){
    r=c;
}
}
public class CircleMain2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of first circles: ");
        double radius1=sc.nextDouble();
        Circle c1=new Circle();
        c1.SetCircle(radius1);
        System.out.println("Enter radius of second circles: ");
        Circle c2=new Circle();
        double radius2=sc.nextDouble();
        c2.SetCircle(radius2);
         System.out.println("Area of first circle is: "+c1.area());
          System.out.println("Area of second circle is : "+c2.area());
    }
}
