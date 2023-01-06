package com.cg.factorial;

public class Fibonacci 
{
	static int a=0,b=1,c;

	public static void main(String[] args) {
		
		/*for(int i=1;i<=10;i++)
		{
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}*/
		
		//using recursion in this we have to declare variable as static.
		System.out.print(a+ " "+b);
		Fibonacci fib = new Fibonacci();
		fib.printfib(10);
	}
	void printfib(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			printfib(i-1);
		}
	}

}
