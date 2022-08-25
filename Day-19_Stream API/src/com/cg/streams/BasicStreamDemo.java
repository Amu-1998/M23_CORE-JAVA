package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) 
	{	
		//stream can be created wit static data
		Stream<String>obj=Stream.of("Ahmed","Ihab","Najeeb","Fidha","Fathima");
		//Terminal Operator- for each
		obj.forEach((i)->System.out.print(i+" "));
		System.out.println();
		
		//stream can be acquired from array or collection
		List<String>obj1=Arrays.asList(new String[] {"23","35","67","23","65"});
		obj=obj1.stream();
		obj.forEach(System.out::println);
	}

}
