package com.cg.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		//PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//this will convert to max heap
		pq.offer(48);// this will add the element
		pq.offer(12);
		pq.offer(36);
		pq.offer(24);
		System.out.println(pq);//min heap is implementing here so o/p will give the integer in order of min no
		
		pq.poll();
		System.out.println(pq);//this will remove the element
		
		System.out.println(pq.peek());//this will show the next element which will be removed

	}

}
