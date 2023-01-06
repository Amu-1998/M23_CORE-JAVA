package com.cg.factorial;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of the String is: "+rev);
	}

}
