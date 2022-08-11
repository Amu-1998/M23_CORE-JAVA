package com.cg.polymorphism;
//prgm on method overloading
class Shape
{
	//by changing the no of arguments
	int area(int a)
	{
		return a*a;
	}
	int area(int a, int b)
	{
		return a*b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		System.out.println(s.area(4));
		System.out.println(s.area(10, 20));

	}

}
