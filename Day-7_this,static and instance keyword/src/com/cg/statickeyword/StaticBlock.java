package com.cg.statickeyword;

public class StaticBlock {
	static int num;
	static String str;
	// static block: if u want to initialize the value without using constructor use static block
	//and make the variable of the class as static block
	static 
	{
		num=15;
		str="Ahmed";
		
	}
	
	
    //constructor
	/*StaticBlock()
	{
		num=15;
		str="Ahmed";
	}*/

	public static void main(String[] args) {
		//StaticBlock s=new StaticBlock();
		//System.out.println(s.num);
		//System.out.println(s.str);
		System.out.println(num);
		System.out.println(str);

	}

}
