package com.cg.finalkeyword;
//if any class is declared as final we can't inherit
//final class Fruit
class Fruit
{
	//we cannot make constructor final
	//final Fruit()
  Fruit()
  {
	  System.out.println("Constructor");
  }
  public void accept()
  {
	  System.out.println("Parent class");
  }
}
class Apple extends  Fruit
{
	public void accept()
	  {
		  System.out.println("Parent class");
	  }
}

public class FinalClass {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.accept();
		// TODO Auto-generated method stub

	}

}
