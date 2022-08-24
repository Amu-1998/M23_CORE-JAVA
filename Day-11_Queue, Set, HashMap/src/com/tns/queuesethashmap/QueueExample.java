package com.tns.queuesethashmap;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(11);
		q.add(12);
		q.offer(21);
		System.out.println(q);
		//it will give the first element
		System.out.println(q.peek());
		//it will remove the element
		System.out.println(q.poll());

	}

}
