package com.cg.collection;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) 
	{
		Stack<String> animal  = new Stack<>();
		animal.push("Lion");//in stack to add element we use push not add
		animal.push("Tiger");
		animal.push("goat");
		System.out.println(animal);
		
		System.out.println(animal.peek());//to check which element is at the top
		
		animal.pop();//it will remove the topmost element
		System.out.println(animal);
		
	}

}
