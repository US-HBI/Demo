package com.example.DemoApp;

//Java Program to Illustrate Automatic Type Conversion

//Main class 
class B {

 // Main driver method
 public static void main(String[] args)
 {
     int i = 100;

     // Automatic type conversion
     // Integer to long type
     long l = i;

     // Automatic type conversion
     // long to float type
     float f = l;

     // Print and display commands
     System.out.println("Int value " + i);
     System.out.println("Long value " + l);
     System.out.println("Float value " + f);
 }
}