package com.cg.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {

	public static void main(String[] args) throws ExecutionException 
	{
		//Lambda expression for runnable interface(Functional interface)
		Runnable r=()->
		{
			try
			{
			TimeUnit.MILLISECONDS.sleep(3000);
			System.out.println("Current Time: "+LocalDateTime.now());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		};
		
		//executor service instance
		ExecutorService obj=Executors.newFixedThreadPool(10);
		obj.execute(r);
		Future<String> res=obj.submit(r, "Done");
		//isDone()-> if task is completed it returns true or false
		
		while(res.isDone()==false)
		{
			try 
			{
				System.out.println("The method returns value: "+res.get());
				break;
			}
			catch(InterruptedException  e)
			{
				e.printStackTrace();
			}
			try
			{
				Thread.sleep(1000L);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			obj.shutdown();
		}

	}

}
