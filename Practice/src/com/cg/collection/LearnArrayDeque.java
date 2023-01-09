package com.cg.collection;

import java.util.ArrayDeque;

public class LearnArrayDeque // we can add or remove the element from front as well as from the back

{

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(23);
		adq.offerFirst(233);//it will add at the starting element
		adq.offerLast(323);////it will add at the last element
		adq.offer(32);
		System.out.println(adq);
		
		System.out.println(adq.peek());//it will show the first element
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll());//it will remove the element
		System.out.println(adq);
		
		System.out.println(adq.pollFirst());
		System.out.println(adq);
		
		System.out.println(adq.pollLast());
		System.out.println(adq);
	}

}
