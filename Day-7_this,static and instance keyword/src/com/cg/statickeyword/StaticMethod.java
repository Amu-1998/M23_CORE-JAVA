package com.cg.statickeyword;

public class StaticMethod {
//without creating the object we can call th method by making the given method name as static	
	
static void print()
{
	System.out.println("Welcome to static keyword concept");
}
	public static void main(String[] args) {
		//StaticMethod m=new StaticMethod();
		//m.print();
		print();

	}

}
