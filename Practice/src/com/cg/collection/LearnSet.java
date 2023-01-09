package com.cg.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet
//it does not allow duplicate elements
{

	public static void main(String[] args) {
		//Set<Integer> set = new HashSet<>();//it will print in any order
		//Set<Integer> set = new LinkedHashSet<>();//it will print in an order
		Set<Integer> set = new TreeSet<>();//we get the elements in sorted form
		
		set.add(24);
		set.add(12);
		set.add(48);
		set.add(36);
		set.add(54);
		
		
		System.out.println(set); 

		set.remove(54);
		System.out.println(set);
		
		System.out.println(set.contains(24));//check whether this element is present or not
		System.out.println(set.size());//how much elements are present
	}

}
