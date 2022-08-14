package com.tns.string;

import java.util.Scanner;

public class StringExample4 {

	public static void main(String[] args) {
		String str="Dhoni";
		
		Scanner s=new Scanner(System.in);
		System.out.println("write your word");
		String str1=s.nextLine();
		
		if(str1.equals(str))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
		s.close();

	}

}
