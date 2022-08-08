package com.tns.ass2;

import java.util.Scanner;

public class SumOfDigits {
      int sum=0;
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number");
		n = s.nextInt();
		SumOfDigits obj = new SumOfDigits();
		int a= obj.add(n);
		System.out.println("sum:" +a);
		s.close();
		}
	int add(int n) {
		sum = n % 10;
		if(n==0)
		{
			return 0;
		}
		else {
			return sum+add(n/10) ;
		}
	}

}
