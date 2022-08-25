package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(4,11,4,22,33,44);
		//filter(predicate) method
		obj.stream().filter(i->i>25).forEach(System.out::println);
		
		System.out.println("The distinct elements are: ");
		obj.stream().distinct().forEach(System.out::println);
		
		System.out.println("The limit is: ");
		obj.stream().limit(3).forEach(System.out::println);
		
		System.out.println("The discarded element is: ");
		obj.stream().skip(3).forEach(System.out::println);

	}

}
