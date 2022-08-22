package com.tns.multithreading;
class Test extends Thread{
{
	System.out.println("Thread passed");
}
}
public class Example2 {

	public static void main(String[] args) {
		Test create =new Test();
		create.start();
		//create.start();

	}

}
