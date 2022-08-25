package com.cg.streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda {

	public static void main(String[] args) {
		Set<Integer> obj= new HashSet<>();
		obj.add(67);
		obj.add(23);
		obj.add(1);
		System.out.println(obj);
		/*if i want to extract this set value we can go aheadwith iterator,but using
		 * stream-api we can do this in one line */
		obj.forEach(System.out::println);
		
	}

}
