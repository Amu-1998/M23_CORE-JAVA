package com.cg.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); 
		queue.offer(12);// instead of add or push we write offer in queue
		queue.offer(24);
		queue.offer(36);
		System.out.println(queue);
		
		System.out.println(queue.poll());//poll will remove the first element inserted
		System.out.println(queue);
		
		System.out.println(queue.peek());//this will tell which element will be removed

	}

}
