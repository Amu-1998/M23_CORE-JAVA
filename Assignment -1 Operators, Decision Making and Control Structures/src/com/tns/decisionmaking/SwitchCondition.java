package com.tns.decisionmaking;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("boom baam");
			break;
			
		case 2:
			System.out.println("hello");
			break;
			
		case 3:
			System.out.println("guys!");
			break;
	    default:
				System.out.println("Invalid Input");
				s.close();
		}

	}

}
