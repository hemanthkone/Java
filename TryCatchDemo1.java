//java program to demonstrate try catch block with try catch block
/*file name: TryCatchDemo1.java
date:7/10/2024
author:hemanth*/
import java.io.*;
import java.util.*;
class TryCatchDemo1{
	public static void main(String args[]){
		int a=5;
		int b=0;
		int c;
		try{
		c=a/b;
		System.out.println("The value of c is "+c);
		}catch(ArithmeticException ae){
			System.out.println("Exception caugth");
		}	
	}
}