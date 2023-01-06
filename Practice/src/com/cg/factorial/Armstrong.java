package com.cg.factorial;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No: ");
		int no = sc.nextInt();
		int t1=no;
		int leng=0;
		while(t1!=0)
		{
			leng=leng+1;
			t1=t1/10;
		}
		int t2 =no;
		
		int rem;
		int arms=0;
		while(t2 !=0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=leng;i++)
			{
				mul=mul*rem;
			}
			arms=arms+mul;
			t2=t2/10;
		}
		if(arms==no)
		{
			System.out.println(no+" is a Armstrong no.");
		}
		else {
			System.out.println(no+" is not a Armstrong no.");
		}
	}

}
