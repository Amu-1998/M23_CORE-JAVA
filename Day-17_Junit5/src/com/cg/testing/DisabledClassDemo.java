package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
//This class will get disabled when you run the code and your all the method output will not get print as it is disabled
public class DisabledClassDemo 
{
	@Test
	void print()
	{
		System.out.println("Using Disable annotation");
	}
}
