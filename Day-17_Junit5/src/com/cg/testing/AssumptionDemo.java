package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void division()
	{
		System.setProperty("Ihab", "Fidha");
		//if assumption is true then printing statement will print
		Assumptions.assumeTrue("Fidha".equals(System.getProperty("Ihab")));
		System.out.println("Assumption is True");
	}
	@Test
	void print()
	{
		System.setProperty("Ihab", "Fidha");
		//if assumption is false then printing statement will print
		Assumptions.assumeFalse("Fidha".equals(System.getProperty("Iha")));
		System.out.println("Assumption is False");
	
}
	}
