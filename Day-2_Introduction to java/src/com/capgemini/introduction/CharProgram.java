package com.capgemini.introduction;
import java.util.Scanner;
//prg on character input
public class CharProgram {

	public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       System.out.println("Enter the  value of x: ");
       
       //compile-time input
       //char x='a'
       char x=s.next().charAt(0);
       System.out.println("The character is : "+x);
    		  
       
	}

}
