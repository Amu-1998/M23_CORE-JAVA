package com.cg.package4;
class Car{
	protected void print()
	{
		System.out.println("Hi there");
	}
}
class Mercedes extends Car
{
	
}

public class ProtectedExample {

	public static void main(String[] args) {
		Mercedes m=new Mercedes();
		m.print();

	}

}
