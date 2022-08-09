package com.cg.superdemo;

public class Base2 extends Base1 {
	Base2()
	
	{
		super();
		System.out.println("Default constructor for Base2");
	}
	Base2(int i)
	{
	     super(i);
		System.out.println("Parameterised constructor for Base2: "+i);
	}


}
