//Java prograam to demonstrate static classes
/*
file name:Test_Inner.java
date:12/08/2024
author:hemanth
*/
import java.io.*;
public class Test_Outer {
    static int data = 30;
    static class Test_Inner {
        void msg() {
            System.out.println("Data is " + data);
        }
    }
    public static void main(String args[]) {
        Test_Inner obj = new Test_Inner();
        obj.msg(); 
    }
}
