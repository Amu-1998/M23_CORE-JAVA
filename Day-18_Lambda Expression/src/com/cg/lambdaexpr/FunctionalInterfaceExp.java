package com.cg.lambdaexpr;
interface E
{
	int add(int a, int b);
}
public class FunctionalInterfaceExp {

	public static void main(String[] args) {
		
		/*Lambda expression without return statement 
		E obj=(int a, int b)->
		{
			return a+b;
		};
		System.out.println(obj.add(45, 12));*/
		E obj =(int a, int b)->(a+b);
		System.out.println("Addition of a and b is: "+obj.add(45, 12));

	}

}
