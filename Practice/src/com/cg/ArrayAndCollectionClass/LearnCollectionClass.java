package com.cg.ArrayAndCollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

	public static void main(String[] args) 
	{
		Comparator<String> str = new Comparator<String>() 
		{
			public int compare(String a, String b)
			{
				if(a.length()>b.length())
					return 1;
				else
					return -1;
			}
		};
		
		
		
		List<String> list = new ArrayList<>();
		list.add("Ahmed");
		list.add("Najeeb");
		list.add("Ihab");
		list.add("Fathima");
		list.add("Amu");
		System.out.println(list);
		
		Collections.sort(list,str);
		System.out.println(list);
		
		
		
		
		
		
		
		
		/*List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(54);
		list.add(22);
		list.add(33);
		list.add(41);
		list.add(22);
		
		System.out.println(Collections.min(list));//to check the min value in list
		System.out.println(Collections.max(list));//to check the max value
		System.out.println(Collections.frequency(list,22));//to check how many 22 are there
		
		Collections.sort(list);//it will get sorted in min value first
		System.out.println(list);
		
		Collections.sort(list, Comparator.reverseOrder());//it will get sorted in max value first
		System.out.println(list);*/
	}

}
