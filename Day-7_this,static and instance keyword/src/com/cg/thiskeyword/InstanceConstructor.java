package com.cg.thiskeyword;
//this can be passed as argument in the constructor call
class A
{
	public int num;
   A()
   {
	    System.out.println("welcome to m23 batch");   
   }
   A(int num)
   {
	   this.num=num;
	   
   }
}
public class InstanceConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("unused")
		A a=new A();
        A b=new A(5);
        System.out.println(b.num);
	}

}
