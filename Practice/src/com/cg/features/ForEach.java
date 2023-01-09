package com.cg.features;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) 
	{
		List<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(5);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		System.out.println(nums);

		
		nums.forEach(n -> System.out.println(n));
		
		

		/*for(int i=0; i<5; i++)
		{
			System.out.println(nums.get(i));
		}*/
		
		/*//Enhanced For loop
		for(int n : nums)
		{
			System.out.println(n);
		}*/
		
	
	}

}
