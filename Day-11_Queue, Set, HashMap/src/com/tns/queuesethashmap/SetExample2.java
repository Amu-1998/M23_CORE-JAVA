package com.tns.queuesethashmap;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		SortedSet s=new TreeSet();
		s.add(45);
		s.add(33);
		s.add(43);
		System.out.println(s);

	}

}
