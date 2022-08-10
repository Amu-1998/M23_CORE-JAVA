package com.cg.thisdemo;

public class Derived extends Base1
{
    Derived()
    {
    	System.out.println("Default constructor for derived");
    }
    Derived(int i)
    {
    	this();
    	System.out.println("parameterized constructor for derived");
    }
}
