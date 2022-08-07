package com.tns.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		boolean res=x>y && x<y;
		boolean res1=x<y && x<y;
		System.out.println(res);
		System.out.println(res1);
		sc.close();

	}

}
