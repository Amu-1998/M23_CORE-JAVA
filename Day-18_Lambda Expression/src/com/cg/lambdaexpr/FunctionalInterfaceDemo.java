package com.cg.lambdaexpr;
//Functional interface
interface D
{
	String display(String str);  //abstract method
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args)
	{
		//Lambda expression with return statement 
		@SuppressWarnings("unused")
		D obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome to lambda expression concept"));
		
	}

}
