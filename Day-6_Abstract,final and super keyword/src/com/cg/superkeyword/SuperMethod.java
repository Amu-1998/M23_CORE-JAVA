package com.cg.superkeyword;
class A
{
    public int Pin;
    public void display(int pin)
    {
    	System.out.println("Pin is: "+Pin);
    }
}
class B extends A
{
   public int pin;
   public void display(int pin)
   {
	   System.out.println("pin is: "+pin);
   }
   public void print()
   {
	   display(3452);  //child class method
	   super.display(9864);  //parent class method
   }
}

public class SuperMethod {

	public static void main(String[] args) {
		
		B b=new B();
		b.print();
		

	}

}
