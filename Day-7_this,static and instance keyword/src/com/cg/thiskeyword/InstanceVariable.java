package com.cg.thiskeyword;
class X
{
    public int m1,m2;
    public void print(int m1,int m2)
    {
    	this.m1=m1;
    	this.m2=m2;
    }
    public void display()
    {
    	System.out.println("Sum is: "+(m1+m2));
    }
}

public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj=new X();
		obj.print(11,25);
		obj.display();

	}

}
