package com.tns.multithreading;

public class Example3 {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println("Current Thread :" +t);
		t.setName("Ahmed");
		System.out.println("Current Thread :" +t);
		try 
		{
			Thread.sleep(1);
		}
		catch (InterruptedException e)
		{
			System.out.println("Main Thread interrupterd ");
		}

	}

}
