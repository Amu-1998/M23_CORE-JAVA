package com.cg.instancofoperator;
class A
{
	
}

public class ChildInstance extends A
{

	public static void main(String[] args) {
		ChildInstance c=new ChildInstance();
		// c is the obj of parent class "A" because ChildInstance class accessing the A class
		System.out.println(c instanceof A);
		System.out.println(c instanceof ChildInstance);

	}

}
