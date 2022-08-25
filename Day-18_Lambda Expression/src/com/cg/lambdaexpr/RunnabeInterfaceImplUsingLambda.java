package com.cg.lambdaexpr;
//To implement a runnable interface method
public class RunnabeInterfaceImplUsingLambda {

	public static void main(String[] args) {
		//we cannot create an object of runnable interface
		/*Runnable R1 = new Runnable()
				{
					public void run()
					{
						System.out.println("Runnable interface implementation");
					}
				};*/
				Runnable R1 =()->
				{
					System.out.println("Runnable interface implementation");
				};
				Thread t =new Thread(R1);
				t.start(); //when we call start it will come into run method as discussed in life cycle of thread  

	}

}
