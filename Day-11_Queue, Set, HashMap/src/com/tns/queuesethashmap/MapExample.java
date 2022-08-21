package com.tns.queuesethashmap;

//import java.util.HashMap;
//import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		NavigableMap<Integer,String> s=new TreeMap<Integer,String>();
		s.put(3, "Ritika");
		s.put(26, "Ahmed");
		//s.remove(3);
		System.out.println(s);
		System.out.println(s.firstEntry());

	}

}
