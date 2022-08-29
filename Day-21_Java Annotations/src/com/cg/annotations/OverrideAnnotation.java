package com.cg.annotations;
//@Override annotation is giving the extra information about this method
class Car 
{
	public void speed(int s)
	{
		System.out.println("Speed is : "+s+"Km/hr");
	}
}
class BMW extends Car
{
	@Override
	public void speed(int s)
	{
		System.out.println("Speed is : "+s+"Km/hr");
	}
}

public class OverrideAnnotation {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.speed(80);
		

	}

}
