package com.cg.polymorphism;
class A
{
	// by having diff type of arguments
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
}

public class CompileTime {

	public static void main(String[] args) {
		A obj=new A();
		obj.add(2,3);
		obj.add(3.4f, 4.3f);
		

	}

}
