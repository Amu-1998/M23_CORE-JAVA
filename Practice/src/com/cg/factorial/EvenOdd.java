package com.cg.factorial;

import java.util.Scanner;

public class EvenOdd {
	static int no;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		sc.nextInt();
		if( no%2 ==0)
		{
			System.out.println("It is a even no");
		}
		else
		{
			System.out.println("It is a odd no");
		}

	}

}
