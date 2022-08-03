package com.cg.oops;

import java.util.Scanner;

class Vehicle {
	  int a;
	  void display()
	  {
		  System.out.println("Welcome to M23 Batch");
		  
	  } }
  
public class RuntimeClassAndObject {

	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		//int a=s1.nextInt();
		obj.a=s1.nextInt();
		obj.display();
		
		System.out.println(obj.a);
		s1.close();
			
	}

}
