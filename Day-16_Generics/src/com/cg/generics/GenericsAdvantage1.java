package com.cg.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantage1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> obj=new LinkedList<>();
		obj.add(12);
		// 1. Type Safety
		//obj.add("Ahmed");
		System.out.println(obj);
		// 2.Type casting is not required
		List <Integer> obj2=new ArrayList<>();
		// 3.compile Time checking
		//obj2.add("15");
		Integer d=obj2.get(0);
		System.out.println(obj2);

	}

}
