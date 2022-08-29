package com.cg.annotations;
class A
{
	@Deprecated
	//It is no longer to be used
	public void print()
	{
		System.out.println("Welcome to the c2tc program");
	}
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		A a=new A();
		a.print();

	}

}
