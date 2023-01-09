package com.cg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LearnArrayList 
{

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		list.add(4);//this will add 4 at the end of the list
		System.out.println(list);
		
		list.add(1,10);//this will add 10 in the index position 1
		System.out.println(list);
		
		List<Integer> newlist = new ArrayList();// this will create new list
		newlist.add(10);
		newlist.add(20);
		list.addAll(newlist);//this will add all the element in the new list
		System.out.println(list);
		
		System.out.println(list.get(5));//this will get the element in the index position 5
		System.out.println(list);
		
		/*list.remove(2);//this will remove the element at index position 2
		list.remove(Integer.valueOf(10));//this will remove the integer value which is 10 here
		System.out.println(list);
		list.clear();//this will remove all the elements in the list
		System.out.println(list);*/
		
		list.set(2,200);
		System.out.println(list);//it will update the value at index position 2
		
		System.out.println(list.contains(3));//it will check whether the value 3 is present
		
		for(int i=0; i< list.size(); i++)//iterating using for loop
		{
			System.out.println("The Elements are: "+list.get(i));
		}
		
		for(Integer element: list)//iterating using for each loop
		{
			System.out.println("foreach element is: "+element);
		}
		
		Iterator<Integer> itr = list.iterator();//using iterator
		while(itr.hasNext()) {
			System.out.println("Iterator "+itr.next());
		}
		
		
		
		
		
	}

}
