package com.cg.exceptionhandling;

import java.util.Scanner;

public class ArithmeticExpression {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=15,res = 0;
		
		System.out.println("Enter the value of b: ");
		int b=s.nextInt();
		
		//try block contains exception and non exception code
		try {
			res=a/b;
		}
		
		//handling exception using catch block
		//Exception is predefined class in java
		catch(Exception e)
		{
			System.out.println("Exception Handled" +e);
		}
		
		s.close();
		System.out.println(res);

	}

}
