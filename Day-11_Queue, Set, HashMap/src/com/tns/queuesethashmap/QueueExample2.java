package com.tns.queuesethashmap;

import java.util.ArrayDeque;


public class QueueExample2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("Hello");
		System.out.println(a);
		a.addFirst(12);
		a.addLast("World");
		System.out.println(a);

	}

}
