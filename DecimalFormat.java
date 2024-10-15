//Java prograam to demonstrate Decimal format
/*
file name:DecimalFormat.java
date:14/08/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
import java.text.*;
public class FormatedOutputDemo2{
    public static void main(String args[]){
        double x=123.456;
        System.out.printf("\n The number is :%f\n " , x);
        DecimalFormat df = new DecimalFormat("####");
         System.out.println("without fractional part the number is : "+df.format(x));
         df = new DecimalFormat("####");
          System.out.println("Formatted number with pricission is: "+df.format(x));
    }
}
