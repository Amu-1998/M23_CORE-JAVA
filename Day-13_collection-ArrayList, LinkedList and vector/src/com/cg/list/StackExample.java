package com.cg.list;

import java.util.Stack;

public class StackExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Stack obj= new Stack();
		obj.add(0,"Ahmed");
		obj.add(0,'s');
		obj.add(0,12.5f);
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);

	}

}
