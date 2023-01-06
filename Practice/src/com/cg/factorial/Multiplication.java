package com.cg.factorial;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which table do you want");
		int no=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+no*i);
		}

	}

}
