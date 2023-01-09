package com.cg.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//it stores the value in key and value
public class LearnMap {

	public static void main(String[] args) {
		//key value pair
		//Map<String, Integer> number = new HashMap<>();//this will not get sorted
		Map<String, Integer> number = new TreeMap<>();//this will get sorted based on keys
		
		number.put("One",1);//to add key(these are unique) value
		number.put("Two",2);
		number.put("Three",3);
		number.put("Three",4);
		number.put("Five",5);
		
		System.out.println(number);
		
		number.put("Three",33);//The value will get updated if the key value is same
		System.out.println(number);
		
		number.remove("Three");//it will remove if this key value is present
		System.out.println(number);
		
		number.putIfAbsent("Three",3); //it will check if this key is present if not then only 
		//it would get added. 
		System.out.println(number);
		
		for(Map.Entry<String, Integer> e: number.entrySet())//for iterating
		{
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
	}

}
