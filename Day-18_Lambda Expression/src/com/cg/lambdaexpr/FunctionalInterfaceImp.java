package com.cg.lambdaexpr;
interface A
{
	void print(); //abstract method
}


public class FunctionalInterfaceImp
{
	

	public static void main(String[] args) {
		/*b b=new B();
		b.print();*/
		//1. lambda expression implements the functional interface
		//2.length of the reduce
		
		A obj=()->
		{
			System.out.println("Functional Interface implementation using " + "Lambda expression");
		};
		obj.print();
		

	}

}
