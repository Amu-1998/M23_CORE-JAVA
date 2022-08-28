package com.cg.enums;

public enum Size implements PizzaSize {
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	public void size()
	{
		System.out.println("Size is: "+this);
	}

}
