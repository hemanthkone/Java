//Java program to demonstrate invoking parent class constructor by using super keyword when overloaded
/*
file name: SuperDemo2.java
date:17/09/2024
author:hemanth
*/
import java.io.*;
import java.util.*;
class point2D{
	double x,y;
	point2D(){
	x=0.0;
	y=0.0;
	}
	point2D(double x,double y){
		this.x=x;
		this.y=y;
		}
	}
class point3D extends point2D{
	double z;
	point3D(){
		super();
		z=0.0;
	}
	point3D(double x,double y,double z){
	super(x,y);
	this.z=z;
	}
}
class SuperDemo2{
	public static void main(String args[]){
	point3D ob=new point3D();
}
}
