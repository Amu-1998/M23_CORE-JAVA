package com.cg.factorial;

import java.util.Scanner;

public class ReverseNo {

	
	public static void main(String[] args) {
		int rev = 0,rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		while(no !=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
			
		}
		System.out.println(rev);

	}

}
