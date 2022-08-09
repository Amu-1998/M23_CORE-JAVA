package com.cg.finalkeyword;
class Car
{
	String name;
	final void print(String name)
	{
		System.out.println("My nae is: "+name);
	}
}
class Audi extends Car
{
	
}
public class FinalInheritedMethod {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.print("Audi");

	}

}
