package com.cg.exceptionhandling;
class CustomExcepton extends Exception
{
	private int detail;
	
	public CustomExcepton(int detail)
	{
		super();
		this.detail=detail;
	}
	public CustomExcepton(String message)
	{
		super(message);
	}
	@Override
	public String toString() {
		return "CustomExcepton [detail=" + detail + "]";
	}
	
}

public class UserExcepyion {
	static void accept(int a)throws CustomExcepton
	{
		System.out.println("called compute");
		if(a>10)
			throw new CustomExcepton(a);
		System.out.println("No exception");
	}

	public static void main(String[] args) 
	{
		try
		{
			accept(11);
		}
		catch(CustomExcepton e)
		{
			System.out.println("Ahmed "+e);
		}

	}

}
