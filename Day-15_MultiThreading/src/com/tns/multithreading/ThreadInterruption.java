package com.tns.multithreading;
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}

public class ThreadInterruption {

	public static void main(String[] args) {
		Thread t1 =new Thread();
		t1.start();
		System.out.println("is thread interrupted "+t1.isInterrupted());
		t1.interrupt();
		System.out.println("is thread interrupted "+t1.isInterrupted());
		

	}

}
