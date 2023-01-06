package com.cg.factorial;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) 
	{
		String yn;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First No: ");
			int no1 = sc.nextInt();
			System.out.println("Enter Second No: ");
			int no2 = sc.nextInt();
			System.out.println("Select Symbol(+,-,*,/)");
			String symbol= sc.next();
			int res;
			switch(symbol)
			{
				case "+": res = no1 + no2;
				System.out.println("Addition is : " +res);
				break;
				case "-": res = no1 - no2;
				System.out.println("Subtraction is : " +res);
				break;
				case "*": res = no1 * no2;
				System.out.println("Multiplication is : " +res);
				break;
				case "/": res = no1 /no2;
				System.out.println("Division is : " +res);
				break;
				default:
				System.out.println("Invalid Symbol");
				break;
		}
			System.out.println("If you want to continue press y else n");
			yn=sc.next();
			}
		while(yn.equals("y") || yn.equals("Y"));
		
			
						
		

	}

}
