package com.cg.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//we have to use this as it all fall under it
@TestInstance(Lifecycle.PER_CLASS)
public interface TestlifeCycleLogger 
{
	
	@BeforeAll  //this will execute first whichever position in it is.
	default void beforeAllTest()
	{
		System.out.println("Before all test");
	}
	
	
	@AfterAll //executed after all the class
	default void testMethod()
	{
		System.out.println("test Method");
	}
	
}
