package com.cg.superkeyword;
class Android
{
	Android()
   {
	   System.out.println("Lava is Android");
   }
}
class Lava extends Android
{
	Lava()
	{
		super();
		System.out.println("Hello Everyone");
	}
    	
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  @SuppressWarnings("unused")
Lava l = new Lava();
	}

}
