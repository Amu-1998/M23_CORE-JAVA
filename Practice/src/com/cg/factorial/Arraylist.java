package com.cg.factorial;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(0, 10);
		al1.add(1, "Ahmed");
		al1.add(2, 30.21);
		al1.add(3, 'I');
		al1.add(4, "Ahmed");
		al1.add(5, null);
		al1.add(6, null);
		
		System.out.println(al1.size());
		
		ArrayList al2 = new ArrayList();
		al2.add(40);
		al2.add("ihab");
		al1.add(3, 'I');
		al1.add(4, "Ahmed");
		
		al1.addAll(al2);
		System.out.println(al1);
		
		al1.remove(1);
		System.out.println(al1);
		
		//Removes common elements
		al1.removeAll(al2);
		System.out.println(al1);
		
		Iterator itr = al1.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		
	}

}
