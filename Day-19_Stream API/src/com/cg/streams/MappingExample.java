package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {3,43,35,23});
		obj1.stream().map((i->i*i)).forEach((i)->System.out.print(i+" " ));
		System.out.println();
		
		
		List<Integer>obj2=obj1.stream().map((i->i*i)).collect(Collectors.toList());
		System.out.print(obj2+" ");

	}

}
