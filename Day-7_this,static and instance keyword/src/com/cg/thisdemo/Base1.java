package com.cg.thisdemo;

public abstract class Base1 {
	Base1()
	{
		this(65);
		System.out.println("Parameterized constructor for base1");
	}
	Base1(int i)
	{
		System.out.println("Parameterized constructor for base1: "+i);
	}

}
