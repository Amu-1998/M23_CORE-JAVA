package com.cg.collection;

import java.util.HashSet;
import java.util.Set;

public class StudentForHashCodeAndEqualImpl {

	public static void main(String[] args) {
		Set<StudentForHashCodeAndEqual> studentset = new HashSet<>(); 
		studentset.add(new StudentForHashCodeAndEqual(1,"Ahmed"));
		studentset.add(new StudentForHashCodeAndEqual(2,"Ihab"));
		studentset.add(new StudentForHashCodeAndEqual(3,"Fidha"));
		studentset.add(new StudentForHashCodeAndEqual(2,"Najeeb"));
		
		System.out.println(studentset);
		
		StudentForHashCodeAndEqual s1 = new StudentForHashCodeAndEqual(1,"fathima");
		StudentForHashCodeAndEqual s2 = new StudentForHashCodeAndEqual(1,"Najeeb");
		System.out.println(s1.equals(s2));
		
	}

}
