//java program to demonstrate constructor overloading , copy constructor , method overloading  ,multiple classes , this keyword , multiple objects etc
/*file name:CircleMain1.java
date:20/09/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
class Circle extends Object{
    double r;
    Circle(){
        r=0; 
    }
    Circle(double r){
        this.r=r;
    }
    Circle(Circle ob){
        this.r=ob.r;
    }
    double area(){
        return((22/7.0)*r*r);
    }
    double area(double x){
        return((22/7.0)*x*x);
    }
    void SetCircle(double r){
        this.r=r;
    }
}
public class CircleMain{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Circle c1=new Circle();
        System.out.println("After default constructor area of first circle is : "+c1.area());
        System.out.println("Enter radius of first circle ");
        double radius=sc.nextDouble();
        c1.SetCircle(radius);
        System.out.println("Now area of first circle is "+c1.area());
        Circle c2 = new Circle(8.8);
        System.out.println("Area of the second circle is "+c2.area());
        Circle c3=new Circle(5.2);
        System.out.println("Area of the third circle is "+c3.area());
        System.out.println("Area of first circle with radius 7.0 is "+c1.area(7.0));
    }
}
