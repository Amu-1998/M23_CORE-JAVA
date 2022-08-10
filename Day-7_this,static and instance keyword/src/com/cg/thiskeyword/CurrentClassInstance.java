package com.cg.thiskeyword;
class Main
{
   int x,y;
   Main()
   {
	   x=22;
	   y=12;
   }
   Main get()
   {
	   //this keyword is used to return current class instance variable
	   return this;
   }
   public void display()
   {
	   System.out.println("Multiplication is: "+(x*y));
   }
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		
        Main m=new Main();
        m.get().display();
	}

}
