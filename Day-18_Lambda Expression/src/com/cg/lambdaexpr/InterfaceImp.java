package com.cg.lambdaexpr;
interface C
{
	//Lambda expression only work for Functional interface
	void display();
	//void accept();
}

public class InterfaceImp {

	public static void main(String[] args) {
		C obj=()->
		{
			System.out.println("Functional interface");
			
		};
		obj.display();

	}

}
