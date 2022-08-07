package com.tns.operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(java.lang.String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		int b=x-y;
		int f=x*y;
		int g=x/y;
		System.out.println(z);
		System.out.println(b);
		System.out.println(f);
	    System.out.println(g);
	    sc.close();

}
}