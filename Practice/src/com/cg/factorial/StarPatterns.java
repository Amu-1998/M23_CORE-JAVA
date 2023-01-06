package com.cg.factorial;

public class StarPatterns {
	/*
 1. *                2.****         3.---*       4.    *         5. ---*---
	**                  ***           --**            *_*          --*-*-*--
	***                  **           -***           *_*_*         *-*-*-*-*-
	****                  *           ****          *_*_*_*      *-*-*-*-*-*-*
	*/


	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
	/*1.         for(int j=1;j<=i;j++)
	//2. 		 for(int j=4;j>=i;j--)
			{
				System.out.print("*");
				
			}
			System.out.println();*/
			
	/*3.	for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"); //4.(" *")
			}
			System.out.println();
		}*/
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2);k++)
			{
				System.out.print("*"); 
			}
			
			System.out.println();
			}
	}

}
