package com.cg.factorial;

public class Factorial {
	
	static int fact=1;
	public static void main(String[] args) {
		/*int no=5;
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
			System.out.println("factorial of "+no+"is: "+fact);
		}*/
		int no=5;
		Factorial f = new Factorial();
		f.calcfact(no);
		System.out.println("Factorial of "+no+" is "+fact);
		
	}
	void calcfact(int no)
	{
		if(no>=1) 
		{
			fact=fact*no;
			calcfact(no-1);
		}
	}

}
