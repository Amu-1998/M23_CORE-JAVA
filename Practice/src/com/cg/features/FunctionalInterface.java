package com.cg.features;


interface A
{
	void show();
	
}

public class FunctionalInterface {

	public static void main(String[] args) 
	{
		//Lambda Expression
		A obj =()->
		{
			System .out.println("Hi");
		};
		obj.show();
		
		
		
	/*this is annonymous inner class
		A obj = new A() {
			public void show()
			{
				System.out.println("hi");
			}
			
		};
		obj.show();*/

	}

}
