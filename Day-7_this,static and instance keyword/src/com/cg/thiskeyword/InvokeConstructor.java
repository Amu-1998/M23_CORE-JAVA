package com.cg.thiskeyword;
class Z
{
	public int x;
	Z()
	{
		this(78);  //invoking the parameterized constructor 
	}
	//Parameterized constructor
	Z(int x)
	{
		System.out.println("Value is: "+x);
	}
}

public class InvokeConstructor {

	public static void main(String[] args) {
		Z obj=new Z();

	}

}
